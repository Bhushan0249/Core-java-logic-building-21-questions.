package Top_21_core_java_program;

public class sumOfArray_16 {

	// 16) Sum of all elements in integer array?

	private static int sumOfarr(int arr[]) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		return sum;

	}

	public static void main(String[] args) {

		int arr[] = { 87, 45, 57, 674, 32, 23, 657, 345, 234 };

		int bhu = sumOfarr(arr);

		System.out.println(bhu);
	}

}
