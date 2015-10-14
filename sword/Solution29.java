package sword;

/**
 * 数组中出现次数超过一半的数字
 * 
 * @author xhy
 *
 */
public class Solution29 {
	// 计数实现
	public int moreThanHalfNum1(int[] arr) {
		if (arr.length <= 0)
			return 0;
		int result = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (count == 0) {
				result = arr[i];
				count = 1;
			} else if (arr[i] == result)
				count++;
			else
				count--;
		}
		if (!checkMoreThanHalf(arr, result))
			return 0;
		return result;
	}

	// partition实现
	public int moreThanHalfNum2(int[] arr) {
		if (arr.length <= 0)
			return 0;
		int lo = 0;
		int hi = arr.length - 1;
		int mid = arr.length >>> 1;
		int index;
		while (lo < hi) {
			index = Util.partition(arr, lo, hi);
			if (index > mid)
				hi = index - 1;
			else if (index < mid)
				lo = index + 1;
			else
				break;
		}
		int result = arr[mid];
		if (!checkMoreThanHalf(arr, result))
			return 0;
		return result;
	}

	private boolean checkMoreThanHalf(int[] arr, int num) {
		int count = 0;
		for (int i : arr) {
			if (i == num)
				count++;
		}
		return (count << 1) >= arr.length;
	}
}