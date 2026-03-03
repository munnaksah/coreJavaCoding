package codingpractics;

public class NonZero {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 0, 4, 6, 4, 0, 5, 0, 0, 4, 5, 0, 6, 0, 3, 0, 5, 0, 3, 0, 5, 0, 4, 0, 3, 0, 4, 0, 5, 0, 6 };

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
