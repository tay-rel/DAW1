package Practica4;
import java.util.Arrays;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 6, 5, 6, 7, 8 };

		System.out.println(ordenarQuickSort(array));
	}

	public static int ordenarQuickSort(int[] array) {
		int[] arrayPrev = array.clone();
		int[] sortArray = quickSort(array, 0, array.length - 1);

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

	public static int[] quickSort(int[] array, int left, int rigth) {
		int pivot = array[(left + rigth) / 2];
		int i = left;
		int j = rigth;
		int aux;

		do {
			while (array[i] < pivot) {
				i++;
			}

			while (array[j] > pivot) {
				j--;
			}

			if (i <= j) {
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;

				i++;
				j--;
			}
		} while (i <= j);

		if (left < j) {
			array = quickSort(array, left, i);

		}

		if (i < rigth) {
			array = quickSort(array, i, rigth);
		}

		return array;

	}

}
