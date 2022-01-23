package Practica4;
import java.util.Arrays;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 5, 7, 5, 4, 7, 5, 3, 0, 215, 1, 4, 68, 8479 };

		// int array[]= {1,2,3,4,5,6};

		System.out.println(Arrays.toString(array));

		System.out.print("\nArray = ");

		int valido = ordenarBurbuja(array);
		System.out.println(valido);

		ordenarBurbuja(array);
		System.out.println(Arrays.toString(array));

	}

	static int ordenarBurbuja(int array[]) {
		int compara[] = array.clone(); // duplica/clona un array

		try {
			int aux = 0;

			for (int i = 1; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - i; j++) {
					if (array[j] > array[j + 1]) {
						aux = array[j];
						array[j] = array[j + 1];
						array[j + 1] = aux;
					}
				}
			}

			if (Arrays.equals(array, compara)) { // podemos comparar el anterior array con el modificado
				return 0;
			}
		} catch (Exception e) {
			return -1;
		}

		return 1;
	}

}
