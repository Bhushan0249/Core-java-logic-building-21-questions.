package Top_21_core_java_program;

import java.util.Scanner;

public class asumOfDigit5 {

	// 5) Write a program for sum of digits 123 - 6

	private static int sumDigit(String str) {

		int sum = 0;
		String[] arr = str.split("");

		for (int i = 0; i < arr.length; i++) {
			int num = Integer.parseInt(arr[i]);
			sum = sum + num;
		}

		return sum;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the valueee..(0-9)");
		String str = s.next();

		int bhu = sumDigit(str);

		System.out.println(bhu);
		s.close();
	}

}
