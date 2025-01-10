package Top_21_core_java_program;

import java.util.Scanner;

public class stringReverse10 {

	// 10) How to reverse a String in Java?

	private static StringBuffer stringRev(String str) {

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < str.length() / 2; i++) {

			int front = i;
			int back = sb.length() - 1 - i;

			char frontchar = sb.charAt(front);
			char backchar = sb.charAt(back);

			sb.setCharAt(front, backchar);
			sb.setCharAt(back, frontchar);

		}

		return sb;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value...");
		String str = s.next();

		StringBuffer bhu = stringRev(str);

		System.out.println("before: " + str);
		System.out.println("after: " + bhu);

	}

}
