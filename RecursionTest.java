public class RecursionTest {
	public static void main(String[] args) {
		System.out.println("The product of the factorial is: " + factorial(12));
		System.out.println("The nth term of the fibonacci sequence is: " + fibonacci(12));
	}
	
	public static int factorial (int number) {
		if (number == 1)
			return 1;
		else
			return number * factorial(number - 1);		
	}
	
	public static int fibonacci (int number) {
		if (number <= 1)
			return 1;
		if (number == 2)
			return fibonacci(1);
		else
			return fibonacci(number - 1) + fibonacci(number - 2);
	}
}
