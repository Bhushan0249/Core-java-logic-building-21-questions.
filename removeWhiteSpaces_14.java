package Top_21_core_java_program;

import java.util.Scanner;

public class removeWhiteSpaces_14 {

	// 14) How to remove Whitespaces from String

	private static String reSpaces(String str) {

		String bhu = str.trim();

		return bhu;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the valueee...");
		String str = s.nextLine();

		String bhu = reSpaces(str);
		System.out.println("before: " + str + " , length is: " + str.length());
		System.out.println("after: " + bhu + " , length is: " + bhu.length());

		s.close();

	}

}
