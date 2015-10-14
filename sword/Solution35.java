package sword;

/**
 * 第一个只出现一次的字符
 * 
 * @author xhy
 *
 */
public class Solution35 {
	public Character firstNotRepeatingChar(String str) {
		char c = 'a';
		int[] counts = new int[26];
		for (int i = 0; i < str.length(); i++) {
			counts[str.charAt(i) - c]++;
		}
		for (int i = 0; i < str.length(); i++) {
			if (counts[str.charAt(i) - c] == 1)
				return str.charAt(i);
		}
		return '\0';
	}
}