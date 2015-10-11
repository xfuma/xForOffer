package algorithm;

import sword.Utils;

public class Selection {
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min])
					min = j;
			}
			Utils.swap(arr, i, min);
		}
	}
}
