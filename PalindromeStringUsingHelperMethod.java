package recursion;

import java.util.Scanner;

public class PalindromeStringUsingHelperMethod {

	public static boolean isPalindrome(String str) {
		return isPalindrome(str, 0, str.length() - 1);
	}

	// Using helper method
	private static boolean isPalindrome(String str, int low, int high) {

		if (high <= low) {
			return true;
		} else if (str.charAt(low) != str.charAt(high)) {
			return false;
		} else {
			return isPalindrome(str, low + 1, high - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(isPalindrome(str));
	}

}
