package Practica4;
import java.util.Arrays;

public class Ejercicio15 {
	// busqueda binaria

	public static void main(String[] args) {

		int array[] = { 55, 4, 43, 44, 2, 10, 5467, 638, 3, 0, -5, -9 };
		// array desordenado
		System.out.println("Array actual\n");
		System.out.println(Arrays.toString(array));
		
		// array ordenado
		metodoBurbuja(array);

		int indice = buscarNumero(array, 2); // probar
		System.out.println("\nEl elemento 2 esta en el indice " + indice);
	}

	static int buscarNumero(int[] array, int value) {

		int primero, medio, ultimo, guardaMedio;
		primero = 0;
		ultimo = array.length - 1;

		while (primero <= ultimo) {
			medio = (primero + ultimo) / 2;
			guardaMedio = array[medio];// guarda la mitad entre P y U

			System.out.println("Compara a " + value + " con " + array[medio]);
			if (value == guardaMedio) {
				return medio;
			} else if (value < guardaMedio) {
				ultimo = medio - 1; // desplaza a la izquierda
			} else {
				primero = medio + 1;// desplaza a la derecha

			}
		}

		return -1; // no se encuentra el value
	}

	static void metodoBurbuja(int array[]) {
		int aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {// numeroA
				if (array[j] > array[j + 1]) { // si numeroA > numeroS
					aux = array[j]; // intercambiamos
					array[j] = array[j + 1];// numeroA =numeroS
					array[j + 1] = aux;// numeroS=numeroA
				}
			}
		}

		System.out.println("Array ordenado\n");
		System.out.println(Arrays.toString(array));
	}

}
