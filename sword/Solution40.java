package sword;

/**
 * 数组中只出现一次的数字
 * 
 * @author xhy
 *
 */
public class Solution40 {
	public void findNumsAppearOnce(int[] arr) {
		if (arr.length < 2)
			return;
		int num1 = 0;
		int num2 = 0;
		int tmp = 0;
		for (int i : arr)
			tmp ^= i;
		int flag = 1;
		while ((tmp & flag) == 0)
			flag <<= 1;
		for (int i : arr) {
			if ((i & flag) == 0)
				num1 ^= i;
			else
				num2 ^= i;
		}
		System.out.println(num1 + " " + num2);
	}
}