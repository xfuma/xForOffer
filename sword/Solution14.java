package sword;

/**
 * 调整数组顺序使奇数位于偶数前面
 * 
 * @author xhy
 *
 */
public class Solution14 {
	public void reorderOddEven(int[] arr) {
		// 定义左右两个边界
		int lo = 0;
		int hi = arr.length - 1;
		// 指针超过边界1个单位
		int i = lo - 1;
		int j = hi + 1;
		while (true) {
			while (i != hi && !isEven(arr[++i])) {
			}
			while (j != lo && isEven(arr[--j])) {
			}
			if (i >= j)
				break;
			Utils.swap(arr, i, j);
		}
	}

	private boolean isEven(int i) {
		return (i & 1) == 0;
	}
}
