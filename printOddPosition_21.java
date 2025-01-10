package Top_21_core_java_program;

public class printOddPosition_21 {

	// 21) Java Program to print the elements of an array present on odd position

	public static void main(String[] args) {

		int arr[] = { 87, 45, 57, 674, 32, 23, 657, 345, 234 };

		for (int i = 1; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}

	}

}
