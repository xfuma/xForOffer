package algorithm;

public class Merge {
	public static void sort(int[] arr) {
		int[] aux = new int[arr.length];
		sort(arr, aux, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int[] aux, int lo, int hi) {
		if (lo >= hi)
			return;
		int mid = (lo + hi) >>> 1;
		sort(arr, aux, lo, mid);
		sort(arr, aux, mid + 1, hi);
		merge(arr, aux, lo, mid, hi);
	}

	private static void merge(int[] arr, int[] aux, int lo, int mid, int hi) {
		// 复制到临时数组
		for (int k = lo; k <= hi; k++)
			aux[k] = arr[k];
		// 归并到原数组
		int i = lo;
		int j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) // 左半边取尽
				arr[k] = aux[j++];
			else if (j > hi) // 右半边取尽
				arr[k] = aux[i++];
			else if (aux[i] < aux[j])
				arr[k] = aux[i++];
			else
				arr[k] = aux[j++];
		}
	}
}