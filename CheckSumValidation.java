import java.util.Scanner;

public class CheckSumValidation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int enteredDigit = scan.nextInt();
		int holder = 0;
		int count = 0;
		
		for(char c : Integer.toString(enteredDigit).toCharArray()) {
			count += 1;
			if (count % 2 == 0) {
				int a = Character.getNumericValue(c);
				int temp = a * 2;
				if (temp >= 10) {
					for(char ac : String.valueOf(temp).toCharArray()) {
						int ab = Character.getNumericValue(ac);
						holder += ab;
					}
				} else 
					holder += temp;
			}
			else {
				int b = Character.getNumericValue(c);
				holder += b;
			}
		}
		String derinRes = (holder % 10 == 0) ? "Valid" : "Invalid";
		System.out.println("Holder value is: " + holder);
		System.out.println("Is Luhn Checksum Validation Correct: " + derinRes);
	}
}
