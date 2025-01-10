package Top_21_core_java_program;

import java.util.Scanner;

public class Armstrong4 {

	// 4) Write a program for Armstrong number.

	private static boolean Armstrong(int num) {

		int n = 0, temp = 0, copy = 0, digit = 0;

		n = num;
		while (n != 0) {
			n = n / 10;
			digit++;
		}

		n = num;
		while (n != 0) {
			temp = n % 10;
			copy += (Math.pow(temp, digit));
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

		for (int i = 1; i <= num; i++) {
			if (Armstrong(i)) {
				System.out.print(i + " ");
			}
		}
		s.close();

	}

}
