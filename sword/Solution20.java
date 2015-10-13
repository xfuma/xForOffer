package sword;

/**
 * 顺时针打印矩阵
 * 
 * @author xhy
 *
 */
public class Solution20 {
	public void printMatrixInCircle(int[][] arr) {
		int tR = 0;
		int tC = 0;
		int dR = arr.length - 1;
		int dC = arr[0].length - 1;
		while (tR <= dR && tC <= dC) {
			printEdge(arr, tR++, tC++, dR--, dC--);
		}
	}

	private void printEdge(int[][] arr, int tR, int tC, int dR, int dC) {
		if (tR == dR) {
			for (int i = tC; i <= dC; i++)
				System.out.print(arr[tR][i] + " ");
		} else if (tC == dC) {
			for (int i = tR; i <= dR; i++)
				System.out.print(arr[tC][i] + " ");
		} else {
			int curC = tC;
			int curR = tR;
			while (curC != dC)
				System.out.print(arr[tR][curC++] + " ");
			while (curR != dR)
				System.out.print(arr[curR++][dC] + " ");
			while (curC != tC)
				System.out.print(arr[dR][curC--] + " ");
			while (curR != tR)
				System.out.print(arr[curR--][tC] + " ");
		}
	}
}