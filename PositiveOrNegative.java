import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers seperated by the newline '\\n' Character");
		Scanner scanner = new Scanner(System.in);
		int positiveInt = 0;
		int negativeInt = 0;
		int entryLimit = 10;
		
		for (int i = 0; i < entryLimit; i++) {
			int number = scanner.nextInt();
			if (number >= 0)
				positiveInt++;
			else
				negativeInt++;
		}
		
		boolean selection = true;
		
		while (selection) {
			System.out.println("Enter 'P' for positive number count, and 'N' for Negative number count");
			Scanner scanner2 = new Scanner(System.in);
			String userInput = scanner2.nextLine();
			
			if (userInput.equals("P")) {
				System.out.println("PositiveInt is: " + positiveInt);
				selection = false;
			}
			else if (userInput.equals("N")) {
				System.out.println("NegativeInt is: " + negativeInt);
				selection = false;
			}
			else
				System.out.println("Invalid Selection, try again.");
		}
	}

}
