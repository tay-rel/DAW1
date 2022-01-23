package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

import java.util.Scanner;

public class Int04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Indica la cantidad de numeros que quieres introducir para ordenar: ");
		int cantidad = teclado.nextInt();
		int[] numeros = pedirNumeros(cantidad);
		
		System.out.print("Numeros sin ordenar: ");
		mostrarArray(numeros);
		
		int[] numerosOrdenados = ordenarNumeros(numeros);
		
		System.out.print("Numeros ordenados:   ");
		mostrarArray(numerosOrdenados);
		teclado.close();
	}
	
	static int[] pedirNumeros(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[cantidad];
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce el " + (i+1) + "º numero: ");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		return numeros;
	}
	
	static int[] ordenarNumeros(int[] numeros) {
		int aux;
		for(int i = 0; i < numeros.length; i++) {
			for(int j = i; j < numeros.length; j++) {
				if(numeros[j] < numeros[i]) {
					aux = numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = aux;
				}
			}
		}
		
		return numeros;
	}
	
	static void mostrarArray(int[] numeros) {
		String serie = "";
		for(int i = 0; i < numeros.length; i++) {
			serie += numeros[i];
			if(i < numeros.length - 1) { serie += ","; }
		}
		System.out.println(serie);
	}
}