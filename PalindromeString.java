package recursion;

import java.util.Scanner;

public class PalindromeString {

	/*
	 * The below method is not efficient because it creates a new string for
	 * every recursive call. That consumes a mount of memory.
	 */
	public static boolean isPalindrome(String str) {
		if (str.length() <= 1) {
			return true;
		} else if (str.charAt(0) != str.charAt(str.length() - 1)) {
			return false;
		} else
			return isPalindrome(str.substring(1, str.length() - 1));
	}

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(isPalindrome(str));

	}

}
