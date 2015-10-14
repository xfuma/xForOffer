package sword;

import java.util.ArrayList;

/**
 * 最小的k个数
 * 
 * @author xhy
 *
 */
public class Solution30 {
	public static ArrayList<Integer> getLeastNumbers(int[] arr, int k) {
		int lo = 0;
		int hi = arr.length - 1;
		int index;
		while (lo < hi) {
			index = Util.partition(arr, lo, hi);
			if (index > k - 1)
				hi = index - 1;
			else if (index < k - 1)
				lo = index + 1;
			else
				break;
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < k; i++)
			list.add(arr[i]);
		return list;
	}
}