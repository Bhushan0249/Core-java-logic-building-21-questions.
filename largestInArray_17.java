package Top_21_core_java_program;

public class largestInArray_17 {

	// 17) Find largest number in an array?

	private static int maxInArray(int arr[]) {

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;

	}

	public static void main(String[] args) {

		int arr[] = { 87, 45, 57, 999, 32, 23, 657, 345, 234 };

		int bhu = maxInArray(arr);

		System.out.println(bhu);

	}

}
