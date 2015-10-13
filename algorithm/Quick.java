package algorithm;

import sword.Util;

public class Quick {
	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int lo, int hi) {
		if (lo >= hi)
			return;
		int i = partition(arr, lo, hi);
		sort(arr, lo, i - 1);
		sort(arr, i + 1, hi);
	}

	private static int partition(int[] arr, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		int pivot = arr[lo];
		while (true) {
			while (arr[++i] < pivot && i != hi) {}
			while (arr[--j] > pivot) {}
			if (i >= j)
				break;
			Util.swap(arr, i, j);
		}
		Util.swap(arr, lo, j);
		return j;
	}
}
