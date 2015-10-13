package sword;

public class Util {
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void reverse(char[] arr, int low, int high) {
		while (low < high) {
			char tmp = arr[low];
			arr[low++] = arr[high];
			arr[high--] = tmp;
		}
	}
}
