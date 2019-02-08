public class Welcome{
	public static void main (String[] args){
		String greeting = "Welcome to Java Programming";
		System.out.println(greeting);
		
		// Descending Hash Triangle
//		for (int i = 5; i > 0; i--) {
//			StringBuilder sb = new StringBuilder();
//			for (int j = 1; j <= i; j++) {
//				sb.append("#");
//			}
//			System.out.println(sb);
//		}
		
		// Block Hashes
//		for (int i = 0; i < 5; i++) {
//			StringBuilder sb = new StringBuilder();
//			for (int j = 0; j < 5; j++) {
//				sb.append("#");
//			}
//			System.out.println(sb);
//		}
		
		// Sideways Hash Triangle
//		for (int row = 1; row <= 7; row++) {
//			StringBuilder sb1 = new StringBuilder();
//			StringBuilder sb2= new StringBuilder();
//			if (row < 5) {
//				for (int hashNum = 1; hashNum <= row; hashNum++) {
//					sb1.append("#");
//				}
//				System.out.println(sb1);
//			} else {
//				for (int hashNum = 1; hashNum <= 8 - row; hashNum++) {
//					sb2.append("#");
//				}
//				System.out.println(sb2);
//			}
//		}
		
		for (int row = 1; row <= 7; row++) {
			int a1 = 0;
			int a2 = 0;
			if (row < 5) {
				for (int hashNum = 1; hashNum <= row; hashNum++) {
					a1++;
				}
				System.out.println(a1);
			} else {
				for (int hashNum = 1; hashNum <= 8 - row; hashNum++) {
					a2++;
				}
				System.out.println(a2);
			}
		}
	}
}