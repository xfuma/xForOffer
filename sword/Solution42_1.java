package sword;

/**
 * 翻转单词顺序
 * 
 * @author xhy
 *
 */
public class Solution42_1 {
	// 两次旋转
	public String reverseSentence(String str) {
		if (str.trim().equals(""))
			return str;
		char[] arr = str.toCharArray();
		Util.reverse(arr, 0, arr.length - 1);
		int lo = 0;
		int hi = 0;
		while (lo < arr.length) {
			if (arr[lo] == ' ') {
				lo++;
				hi++;
			} else if (hi == arr.length || arr[hi] == ' ') {
				Util.reverse(arr, lo, hi - 1);
				lo = ++hi;
			} else
				hi++;
		}
		return String.valueOf(arr);
	}

	// 字符串分割
	public String reverseSentence2(String str) {
		if (str.trim().equals(""))
			return str;
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}
}