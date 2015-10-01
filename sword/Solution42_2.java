package sword;

/**
 * 左旋转字符串
 * 
 * @author xhy
 *
 */
public class Solution42_2 {
	// 截取法
	public String leftRotateString(String str, int k) {
		if (str.length() < k)
			return "";
		int len = str.length();
		str += str;
		return str.substring(k, k + len);
	}

	// 旋转法
	public String leftRotateString2(String str, int k) {
		if (str.length() < k)
			return "";
		char[] c = str.toCharArray();
		Utils.reverse(c, 0, c.length - 1);
		Utils.reverse(c, 0, k - 1);
		Utils.reverse(c, k, c.length - 1);
		return String.valueOf(c);
	}
}