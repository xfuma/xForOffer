package sword;

/**
 * 旋转数组的最小数字
 * 
 * @author xhy
 *
 */
public class Solution08 {
	public int minNumberInRotateArray(int[] arr) {
		if (arr == null || arr.length <= 0)
			return 0;
		int lo = 0;
		int hi = arr.length - 1;
		int mid = lo;
		while (arr[lo] >= arr[hi]) {
			if (hi - lo == 1) {
				mid = hi;
				break;
			}
			mid = (lo + hi) >>> 1;
			// 若三数相等则只能顺序查找
			if (arr[lo] == arr[hi] && arr[lo] == arr[mid])
				return minInOrder(arr, lo, hi);
			if (arr[mid] >= arr[lo])
				lo = mid;
			else if (arr[mid] <= arr[hi])
				hi = mid;
		}
		return arr[mid];
	}

	private int minInOrder(int[] arr, int lo, int hi) {
		int min = arr[lo];
		for (int i = lo + 1; i < hi; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	}
}