package Top_21_core_java_program;

public class Fibonacci3 {

	// 3) Write a program for Fibonacci series.

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		for (int i = 1; i < 10; i++) {
			n3 = n1 + n2;

			System.out.println(n3);

			n1 = n2;
			n2 = n3;

		}

	}
}
