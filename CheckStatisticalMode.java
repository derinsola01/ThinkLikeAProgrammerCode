
public class CheckStatisticalMode {

	public static void main(String[] args) {
		int[] numbers = {12, 16, 13, 16, 14, 16, 15, 17, 15, 16};
		int modeCounter = 0;
		int elementVal = 0;
		for (int i = 0; i < numbers.length; i++ ) {
			int temp = 1;
			for (int j = i + 1; j < numbers.length; j++ ) {
				if(numbers[i] == numbers[j]) {
					temp++;
				}
			}
			if (temp > modeCounter) {
				modeCounter = temp;
				elementVal = numbers[i];
			}
			
		}
		
		System.out.println("modeCounter is: " + modeCounter + "\t elementVal is: " + elementVal);
		

	}

}
