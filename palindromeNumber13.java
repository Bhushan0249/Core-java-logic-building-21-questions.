package Top_21_core_java_program;

import java.util.Scanner;

public class palindromeNumber13 {

	// 13) Java Program to check if number is palindrome Check?

	private static boolean palindrome(int num) {

		int n = 0, temp = 0, copy = 0;

		n = num;
		while (n != 0) {
			temp = n % 10;
			copy = copy * 10 + temp;
			n = n / 10;
		}

		if (copy == num) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the valueee....");
		int num = s.nextInt();

		if (palindrome(num)) {
			System.out.println("valid palindrome....");
		} else {
			System.out.println("NOT valid palindrome...");
		}

		s.close();

	}

}
