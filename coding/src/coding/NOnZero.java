package coding;

public class NOnZero {
	public static void main(String[] args) {

		int[] arr = { 1, 0, 3, 0, 5, 0, 6, 0, 0, 5, 0, 5 };

		int leng = arr.length;
		int count = 0;

		for (int i = 0; i < leng; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}

		while (count < leng) {
			arr[count++] = 0;
		}

		for (int i = 0; i < leng; i++) {
			System.out.println(arr[i]);
		}

	}
}
