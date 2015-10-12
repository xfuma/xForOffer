package algorithm;

import sword.Utils;

public class Bubble {
	public static void sort(int[] arr) {
		boolean swapped = true;
		for (int i = 0; i < arr.length - 1 && swapped; i++) {
			swapped = false;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					Utils.swap(arr, j, j - 1);
					swapped = true;
				}
			}
		}
	}
}