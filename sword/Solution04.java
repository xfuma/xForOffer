package sword;

/**
 * 替换空格
 * 
 * @author xhy
 *
 */
public class Solution04 {
	public void replaceSpaces(char[] str, int len) {
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (str[i] == ' ')
				count++;
		}
		int end = len + count * 2;
		str[end] = '\0';
		for (int i = len - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[--end] = '0';
				str[--end] = '2';
				str[--end] = '%';
			} else
				str[--end] = str[i];
		}
	}
}