package sword;

/**
 * 替换空格
 * 
 * @author xhy
 *
 */
public class Solution04 {
	// 假设知道字符串长度为len
	public void replaceSpace(char[] str, int len) {
		int spaceCount = 0;
		int newLen;
		for (int i = 0; i < len; i++) {
			if (str[i] == ' ')
				spaceCount++;
		}
		newLen = len + spaceCount * 2;
		str[newLen] = '\0';
		for (int i = len - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[--newLen] = '0';
				str[--newLen] = '2';
				str[--newLen] = '%';
			} else
				str[--newLen] = str[i];
		}
	}
}