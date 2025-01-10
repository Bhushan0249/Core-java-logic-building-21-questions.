package Top_21_core_java_program;

public class array2ndLarge_18 {

	// 18) Find second largest number in an array?

	private static int max2(int arr[]) {

		int size = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[size - 2];

	}

	public static void main(String[] args) {

		int arr[] = { 87, 45, 57, 674, 32, 23, 657, 345, 234 };

		int bhu = max2(arr);

		System.out.println("second largest: " + bhu);

	}

}
