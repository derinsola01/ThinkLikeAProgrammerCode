public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("The factorial is: " + factorial(20));
	}
	
	public static int factorial (int number) {
		if (number == 1)
			return number;
		else
			return number * factorial(number - 1);		
	}
	
}
