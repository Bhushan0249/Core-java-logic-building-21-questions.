package Top_21_core_java_program;

import java.util.Scanner;

public class digitToWord8 {

	// 8) Write a program for 240 - two four zero.

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the valueee...");
		String str = s.next();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {

				switch (ch) {

				case '0':
					System.out.print(" zero ");
					break;
				case '1':
					System.out.print(" one ");
					break;
				case '2':
					System.out.print(" two ");
					break;
				case '3':
					System.out.print(" three ");
					break;
				case '4':
					System.out.print(" four ");
					break;
				case '5':
					System.out.print(" five ");
					break;
				case '6':
					System.out.print(" six ");
					break;
				case '7':
					System.out.print(" seven ");
					break;
				case '8':
					System.out.print(" eight ");
					break;
				case '9':
					System.out.print(" nine ");
					break;

				}
			}

		}
		s.close();

	}

}
