package sword;

/**
 * 数组中只出现一次的数字
 * 
 * @author xhy
 *
 */
public class Solution40 {
	// num1,num2分别为长度为1的数组,num1[0],num2[0]设置为返回结果
	public void findNumsAppearOnce(int[] arr, int num1[], int num2[]) {
		num1[0] = 0;
		num2[0] = 0;
		if (arr.length < 2)
			return;
		int temp = 0;
		for (int i : arr)
			temp ^= i;
		int flag = 1;
		while ((temp & flag) == 0)
			flag <<= 1;
		for (int i : arr) {
			if ((i & flag) == 0)
				num1[0] ^= i;
			else
				num2[0] ^= i;
		}
	}
}