package Top_21_core_java_program;

public class smallestInArray_20 {

	// 20) Java Program to print the smallest element in an array

	private static int minArray(int arr[]) {

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static void main(String[] args) {

		int arr[] = { 87, 45, 57, 674, 32, 23, 657, 345, 234 };

		int bhu = minArray(arr);

		System.out.println("smallest element: " + bhu);

	}

}
