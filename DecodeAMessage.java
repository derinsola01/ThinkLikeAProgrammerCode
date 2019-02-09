import java.util.ArrayList;
import java.util.Scanner;

public class DecodeAMessage {
	public static void main(String[] args) {
		ArrayList<String> numArray = new ArrayList<String>();
		final String uppercase = "U";
		final String lowercase = "L";
		final String punctuation = "P";
		System.out.println("Enter numbers separated by commas");
		for ( int i = 0; i < 4; i++ ) {
			Scanner scanner = new Scanner(System.in);
			String userInput = scanner.nextLine();
			String[] absHolder = userInput.split(",");
			StringBuilder absBuilder = new StringBuilder();
			for (int absIndex = 0; absIndex < absHolder.length; absIndex++ ) {
				absBuilder.append(absHolder[absIndex]);
			}
			
			numArray.add(absBuilder.toString());
		}
		
		System.out.println("Select Decoding Method: 'u' for Uppercase, 'l' for Lowercase and 'p' for Punctuation");
		Scanner userMode = new Scanner(System.in);
		String decodingMode = userMode.nextLine().toString();
		
		if (uppercase.equalsIgnoreCase(decodingMode)) {
			for (String num : numArray) {
				Character chr = returnAlphabet(num);
				char returnedCharacter = chr.toUpperCase(chr);
				System.out.println("chr is: " + chr + "\treturnedCharacter is: " + returnedCharacter);
			}
		} else if (lowercase.equalsIgnoreCase(decodingMode)) {
			for (String num : numArray) {
				Character chr = returnAlphabet(num);
				char returnedCharacter = chr.toLowerCase(chr);
				System.out.println("chr is: " + chr + "\treturnedCharacter is: " + returnedCharacter);
			}
		} else if (punctuation.equalsIgnoreCase(decodingMode)) {
			for (String num : numArray) {
				int convNum = Integer.parseInt(num);
				int modNum = symbolModulo(convNum);
				String chr = returnSymbol(modNum);
				System.out.println("convNum is: " + convNum + "\tmodNum is: " + modNum + "\tchr is: " + chr);
			}
		}
	}
	
	public static Character returnAlphabet(String str) {
		int convNum = Integer.parseInt(str);
		int modNum = charModulo(convNum);
		Character chr = returnChar(modNum);
		return chr;
	}
	
	public static int charModulo (int number) {
		return number % 27;
	}
	
	public static int symbolModulo (int number) {
		return number % 9;
	}
	
	public static String returnSymbol(int number) {
		if (number == 1)
			return "!";
		else if (number == 2)
			return "?";
		else if (number == 3)
			return ",";
		else if (number == 4)
			return ".";
		else if (number == 5)
			return "space";
		else if (number == 6)
			return ";";
		else if (number == 7)
			return "\"";
		else if (number == 8)
			return "'";
		else
			return "Integer given is 0";
	}
	
	public static char returnChar (int number) {
		if (number == 1)
			return 'a';
		else if (number == 2)
			return 'b';
		else if (number == 3)
			return 'c';
		else if (number == 4)
			return 'd';
		else if (number == 5)
			return 'e';
		else if (number == 6)
			return 'f';
		else if (number == 7)
			return 'g';
		else if (number == 8)
			return 'h';
		else if (number == 9)
			return 'i';
		else if (number == 10)
			return 'j';
		else if (number == 11)
			return 'k';
		else if (number == 12)
			return 'l';
		else if (number == 13)
			return 'm';
		else if (number == 14)
			return 'n';
		else if (number == 15)
			return 'o';
		else if (number == 16)
			return 'p';
		else if (number == 17)
			return 'q';
		else if (number == 18)
			return 'r';
		else if (number == 19)
			return 's';
		else if (number == 20)
			return 't';
		else if (number == 21)
			return 'u';
		else if (number == 22)
			return 'v';
		else if (number == 23)
			return 'w';
		else if (number == 24)
			return 'x';
		else if (number == 25)
			return 'y';
		else if (number == 26)
			return 'z';
		else
			return '0';
	}

}
