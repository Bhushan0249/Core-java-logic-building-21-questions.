package Top_21_core_java_program;

import java.util.Scanner;

public class vowel_12 {

	// 12) Java Program to check if a vowel is present in the string?

	public static void main(String[] args) {
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the valueee...");
		String str = s.next();

		str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

				System.out.print(ch + " ");
				count++;

			}
		}
		System.out.println(count);
		s.close();

	}
}
