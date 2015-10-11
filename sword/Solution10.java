package sword;

/**
 * 二进制中1的个数
 * 
 * @author xhy
 *
 */
public class Solution10 {
	// 与自身减1位与，每次去掉右边的1
	public int numOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);
		}
		return count;
	}

	// 用1移位扫描
	public int numOfOne(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((n & flag) != 0)
				count++;
			flag <<= 1;
		}
		return count;
	}
}