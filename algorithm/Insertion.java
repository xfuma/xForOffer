package algorithm;

public class Insertion {
	public static void sort(int[] arr) {
		int j;
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];
			for (j = i; j > 0 && tmp < arr[j - 1]; j--)
				arr[j] = arr[j - 1];
			arr[j] = tmp;
		}
	}
}