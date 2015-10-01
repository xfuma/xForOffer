package sword;

public class Utils {
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void reverse(char[] c, int low, int high) {
		while (low < high) {
			char temp = c[low];
			c[low++] = c[high];
			c[high--] = temp;
		}
	}

	public static void print(ListNode node) {
		while (node != null) {
			System.out.print(node.val + " ");
			node = node.next;
		}
		System.out.println("");
	}
}
