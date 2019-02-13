public class RecursionArray {
	
//	Calculating the sum of an array via recursion
	
	public static void main(String[] args) {
		int[] givenArray = {1,2,3,4,5,6,7,8,9};
		int arrayLength = givenArray.length;
		int summation = arrayAdder(givenArray, arrayLength);
		System.out.println( "The summation of the array by recursion is: " + summation );
	}
	
//	tail recursion
	public static int arrayAdder(int[] arr, int arrSize) {
		if (arrSize == 0)
			return 0;
		else
			return arr[arrSize-1] += arrayAdder(arr, arrSize - 1);
	}
}
