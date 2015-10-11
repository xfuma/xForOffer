package algorithm;

public class Binary {
	public static int search(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) >>> 1;
			if (arr[mid] < key)
				lo = mid + 1;
			else if (arr[mid] > key)
				hi = mid - 1;
			else
				return mid;
		}
		return -1;
	}

	// 递归实现
	public static int search2(int[] arr, int key) {
		return search(arr, key, 0, arr.length - 1);
	}

	private static int search(int[] arr, int key, int lo, int hi) {
		if (lo > hi)
			return -1;
		int mid = (lo + hi) >>> 1;
		if (arr[mid] > key)
			return search(arr, key, lo, mid - 1);
		else if (arr[mid] < key)
			return search(arr, key, mid + 1, hi);
		else
			return mid;
	}
}