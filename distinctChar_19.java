package Top_21_core_java_program;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class distinctChar_19 {

	// 19) How to get distinct characters and their count in a String?

	private static LinkedHashMap<String, Integer> repCharacter(String str) {

		str = str.toLowerCase();
		String[] arr = str.split("");

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		return map;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the valueee...");
		String str = s.next();

		LinkedHashMap<String, Integer> bhu = repCharacter(str);

		System.out.println(bhu);

		s.close();

	}

}
