import java.util.Scanner;

public class LuhnCheckSumValidator {
	public static void main(String[] args) {
        System.out.println("Enter a Number below: ");
        Scanner userInput = new Scanner(System.in);

        int inp = userInput.nextInt();
//      int num = 1762483;                          Integer.toString(num).toCharArray();      Conversion to charArray

        char[] numChar = Integer.toString(inp).toCharArray();
        int resultHolder = derinMethod(numChar);
        String luhnValidator = resultHolder % 10 == 0 ? "The number is Valid" : "The number is inValid";
        
        System.out.println("Final resultHolder now holds: " + resultHolder);
        System.out.println("luhnValidator is: " + luhnValidator);
    }
	
	public static int derinMethod (char[] arr) {
		int d1Holder = 0;
		for (int i = 0; i < arr.length; i++) {
			int chrNum = Character.getNumericValue(arr[i]);
			int numRes = ((i + 1) % 2 == 0) ? multiplyBy2(chrNum) : chrNum;
			d1Holder += numRes;
		}
		
		return d1Holder;
	}
	
	public static int multiplyBy2(int num) {
		int d1 = num * 2;
		int res = (d1 >= 10) ? multiplyBy2If(d1) : d1;
		return res;
	}
	
	public static int multiplyBy2If(int numb) {
		int d2 = 0;
		for (char chr : Integer.toString(numb).toCharArray())
			d2 += Character.getNumericValue(chr);
		return d2;	
	}

}
