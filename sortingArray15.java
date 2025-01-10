package Top_21_core_java_program;

public class sortingArray15 {

	// 15) Sorting an array in Java?

	private static int[] sortArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;

	}

	public static void main(String[] args) {

		int arr[] = { 87, 45, 57, 674, 32, 23, 657, 345, 234 };

		int[] bhu = sortArray(arr);

		for (int i = 0; i < bhu.length; i++) {
			System.out.print(bhu[i] + " ");
		}

	}

}
