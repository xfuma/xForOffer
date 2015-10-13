package sword;

import java.util.Arrays;

/**
 * 打印1到最大的n位数
 * 
 * @author xhy
 *
 */
public class Solution12 {
	// 递归实现全排列
	public void print1ToMaxOfNDigits(int n) {
		if (n <= 0)
			return;
		char[] num = new char[n];
		print1ToMaxOfNDigitsRecursively(num, 0);
	}

	private void print1ToMaxOfNDigitsRecursively(char[] num, int index) {
		if (index == num.length) {
			printNum(num);
			return;
		}
		for (int i = 0; i < 10; i++) {
			num[index] = (char) (i + '0');
			print1ToMaxOfNDigitsRecursively(num, index + 1);
		}
	}

	// 模拟实现加法
	public void print1ToMaxOfNDigits2(int n) {
		if (n <= 0)
			return;
		char[] num = new char[n];
		for (int i = 0; i < num.length; i++)
			num[i] = '0';
		while (!increment(num))
			printNum(num);
	}

	private boolean increment(char[] num) {
		boolean overflow = false;
		int carry = 0;
		for (int i = num.length - 1; i >= 0; i--) {
			int nSum = num[i] - '0' + carry;
			if (i == num.length - 1)
				nSum++;
			if (nSum == 10) {
				if (i == 0)
					overflow = true;
				else {
					carry = 1;
					nSum -= 10;
					num[i] = (char) (nSum + '0');
				}
			} else {
				num[i] = (char) (nSum + '0');
				break;
			}
		}
		return overflow;
	}

	private void printNum(char[] num) {
		boolean flag = true;
		for (int i = 0; i < num.length; i++) {
			if (flag && num[i] != '0')
				flag = false;
			if (!flag)
				System.out.print(num[i]);
		}
		System.out.println("");
	}
}