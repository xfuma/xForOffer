package sword;

public class Util {
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void reverse(char[] arr, int lo, int hi) {
		while (lo < hi) {
			char tmp = arr[lo];
			arr[lo++] = arr[hi];
			arr[hi--] = tmp;
		}
	}

	public static int partition(int[] arr, int lo, int hi) {
		int i = lo;
		int j = hi + 1;
		int pivot = arr[lo];
		while (true) {
			while (arr[++i] < pivot && i != hi) {}
			while (arr[--j] > pivot) {}
			if (i >= j)
				break;
			swap(arr, i, j);
		}
		swap(arr, lo, j);
		return j;
	}
}