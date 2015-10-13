package algorithm;

import sword.Util;

public class Bubble {
	public static void sort(int[] arr) {
		boolean swapped = true;
		for (int i = 0; i < arr.length - 1 && swapped; i++) {
			swapped = false;
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					Util.swap(arr, j, j - 1);
					swapped = true;
				}
			}
		}
	}
}