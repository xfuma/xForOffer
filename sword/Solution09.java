package sword;

/**
 * 斐波那契数列
 * 
 * @author xhy
 *
 */
public class Solution09 {
	// 循环实现
	public int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int fibN = 0;
		int minus1 = 1;
		int minus2 = 0;
		for (int i = 2; i <= n; i++) {
			fibN = minus1 + minus2;
			minus2 = minus1;
			minus1 = fibN;
		}
		return fibN;
	}

	// 递归实现，用数组缓存结果
	public int fibonacci2(int n) {
		int[] aux = new int[n + 1];
		return getFibN(n, aux);
	}

	private int getFibN(int n, int[] arr) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (arr[n] == 0)
			arr[n] = getFibN(n - 1, arr) + getFibN(n - 2, arr);
		return arr[n];
	}
}