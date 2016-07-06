package recursion;

import java.util.Scanner;

public class MaxOfArray {
	private static int[] arr = new int[8];
	private static int max = arr[arr.length - 1];

	public static int findMax(int arr[]) {
		return findMax(arr, arr.length - 1);
	}

	private static int findMax(int[] arr, int index) {

		if (index >= 0) {
			if (arr[index] > max) {
				max = arr[index];
			}
			return findMax(arr, index - 1);
		} else {

			return max;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inter elements of the array :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Max = " + findMax(arr));

	}

}
