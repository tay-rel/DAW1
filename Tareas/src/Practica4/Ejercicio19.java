import java.util.Arrays;

public class Ejercicio19 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 4, 2 };

		System.out.println(ordenarMergeSort(array));
	}

	public static int ordenarMergeSort(int[] array) {
		int[] arrayPrev = array.clone();
		int[] sortArray = mergeSort(array, array.length);

		if (Arrays.equals(arrayPrev, sortArray)) {
			return 0;
		} else {
			Arrays.sort(array);

			if (Arrays.equals(array, sortArray)) {
				return 1;
			} else {
				return -1;
			}
		}

	}

	private static int[] mergeSort(int[] array, int length) {

		if (length > 1) {
			int center = length / 2;
			int[] arrayOne = new int[center];
			int[] arrayTwo = new int[length - center];

			for (int i = 0; i < center; i++) {
				arrayOne[i] = array[i];
			}

			for (int j = center; j < length; j++) {
				arrayTwo[j - center] = array[j];
			}

			array = merge(array, mergeSort(arrayOne, center), mergeSort(arrayTwo, length - center), center,
					length - center);
		}

		return array;
	}

	private static int[] merge(int[] array, int[] arrayOne, int[] arrayTwo, int lengthOne, int lengthTwo) {

		int i = 0, j = 0, k = 0;

		while (i < lengthOne && j < lengthTwo) {
			if (arrayOne[i] <= arrayTwo[j]) {
				array[k++] = arrayOne[i++];
			} else {
				array[k++] = arrayTwo[j++];
			}
		}

		while (i < lengthOne) {
			array[k++] = arrayOne[i++];
		}

		while (j < lengthTwo) {
			array[k++] = arrayTwo[j++];
		}

		return array;

	}

}
