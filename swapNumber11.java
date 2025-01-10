package Top_21_core_java_program;

public class swapNumber11 {

	// 11) How to swap two numbers without using a third variable?

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a: " + a);
		System.out.println("b: " + b);

	}

}
