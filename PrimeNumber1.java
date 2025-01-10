package Top_21_core_java_program;

import java.util.Scanner;

public class PrimeNumber1 {

	// 1) Write a program to find prime number.

	private static boolean prime(int num) {

		boolean status = false;

		for (int i = 3; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				status = true;
			} else {
				status = false;
			}
		}

		return status;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the valueee....");
		int num = s.nextInt();

		for (int i = 3; i <= num; i++) {
			if (prime(i)) {
				System.out.print(i + " ");
			}
		}
		s.close();

	}

}
