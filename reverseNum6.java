package Top_21_core_java_program;

import java.util.Scanner;

public class reverseNum6 {

	// 6) Write a program for reverse a number 123 -- 321

	private static int reNumber(int num) {

		int temp = 0, copy = 0;

		while (num != 0) {
			temp = num % 10;
			copy = copy * 10 + temp;
			num = num / 10;
		}
		return copy;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value...");
		int num = s.nextInt();

		int bhu = reNumber(num);

		System.out.println(bhu);
		s.close();
	}

}
