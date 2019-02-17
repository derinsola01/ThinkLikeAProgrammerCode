
public class CheckStatisticalMode {

	public static void main(String[] args) {
		int[] numbers = {12, 16, 13, 20, 20, 20, 16, 14, 16, 15, 20, 20, 17, 15, 16, 20};
		int modeNum = getMode(numbers);
		System.out.println("modeNum is: " + modeNum);
	}
	
	public static int getMode(int[] arr) {
		int modeCounter = 0;
		int elementVal = 0;
		for (int i = 0; i < arr.length; i++ ) {
			int temp = 1;
			for (int j = i + 1; j < arr.length; j++ ) {
				if(arr[i] == arr[j])
					temp++;
			}
			if (temp > modeCounter) {
				modeCounter = temp;
				elementVal = arr[i];
			}
		}
		return elementVal;
	}
}
