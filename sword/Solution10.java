package sword;

/**
 * 二进制中1的个数
 * 
 * @author xhy
 *
 */
public class Solution10 {
	public int getNumOf1(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n & (n - 1);
		}
		return count;
	}
}
