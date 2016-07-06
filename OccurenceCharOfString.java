package recursion;

import java.util.Scanner;

public class OccurenceCharOfString {
	private static int count = 0;

	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}

	private static int count(String str, char a, int high) {
		if (str.charAt(high) == a) {
			count++;
		}
		if (high >= 1) {
			return count(str, a, high - 1);
		} else {
			return count;
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(count(str, 'e'));

	}

}
