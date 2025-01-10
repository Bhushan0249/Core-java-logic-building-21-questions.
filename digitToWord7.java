package Top_21_core_java_program;

import java.util.Scanner;

public class digitToWord7 {

	// 7) Write a program for writing any digit in word

	private static String digiToWord(int num) {

		String word;
		switch (num) {
		case 0:
			word = "Zero";
			break;
		case 1:
			word = "One";
			break;
		case 2:
			word = "Two";
			break;
		case 3:
			word = "Three";
			break;
		case 4:
			word = "Four";
			break;
		case 5:
			word = "Five";
			break;
		case 6:
			word = "Six";
			break;
		case 7:
			word = "Seven";
			break;
		case 8:
			word = "Eight";
			break;
		case 9:
			word = "Nine";
			break;
		default:
			word = "Invalid input";
		}

		return word;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a single digit (0 To 9) ");
		int num = s.nextInt();

		String bhu = digiToWord(num);

		System.out.println("The digit in words is: " + bhu);
		s.close();
	}
}
