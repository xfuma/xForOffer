package sword;

/**
 * 二维数组中的查找
 * 
 * @author xhy
 *
 */
public class Solution03 {
	public boolean find(int[][] arr, int key) {
		if (arr == null)
			return false;
		int row = 0;
		int col = arr[0].length - 1;
		while (row < arr.length && col >= 0) {
			if (arr[row][col] < key)
				row++;
			else if (arr[row][col] > key)
				col--;
			else
				return true;
		}
		return false;
	}
}