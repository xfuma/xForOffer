package sword;

/**
 * 数字在排序数组中出现的次数
 * 
 * @author xhy
 *
 */
public class Solution38 {
	public int getNumOfK(int[] arr, int k) {
		int num = 0;
		if (arr != null && arr.length > 0) {
			int first = getFirstK(arr, k);
			int last = getLastK(arr, k, 0, arr.length - 1);
			if (first > -1 && last > -1)
				num = last - first + 1;
		}
		return num;
	}

	// 循环找第一个k
	private int getFirstK(int[] arr, int k) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) >>> 1;
			if (arr[mid] > k)
				hi = mid - 1;
			else if (arr[mid] < k)
				lo = mid + 1;
			else {
				if (mid > 0 && arr[mid - 1] != k || mid == 0)
					return mid;
				else
					hi = mid - 1;
			}
		}
		return -1;
	}

	// 递归找最后一个k
	private int getLastK(int[] arr, int k, int lo, int hi) {
		if (lo > hi)
			return -1;
		int mid = (lo + hi) >>> 1;
		if (arr[mid] == k) {
			if (mid < arr.length - 1 && arr[mid + 1] != k || mid == arr.length - 1)
				return mid;
			else
				lo = mid + 1;
		} else if (arr[mid] > k)
			hi = mid - 1;
		else
			lo = mid + 1;
		return getLastK(arr, k, lo, hi);
	}
}