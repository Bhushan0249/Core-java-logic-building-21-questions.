package Top_21_core_java_program;

public class generatePattern9 {

	// 9) Write a program to generate any pattern of your wish.
	// print B.

	public static void main(String[] args) {

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 6; j++) {

				if (i == 6 || i == 7 || i == 1 || i == 2 || i == 11 || i == 12 || j == 1 || j == 2 || j == 5
						|| j == 4) {
					System.out.print("o" + " ");
				} else {
					System.out.print("     ");
				}

			}
			System.out.println();
		}

	}

}
