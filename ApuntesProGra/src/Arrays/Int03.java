package Arrays;


/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

import java.util.Scanner;

public class Int03 {
	public static void main(String[] args) {
		System.out.println("Indica los numeros que quieres introducir para ordenar: ");
		int[] numeros = pedirNumeros();
		
		System.out.print("Numeros sin ordenar: ");
		mostrarArray(numeros);
		
		int[] numerosOrdenados = ordenarNumeros(numeros);
		
		System.out.print("Numeros ordenados:   ");
		mostrarArray(numerosOrdenados);
	}
	
	static int[] pedirNumeros() {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[5];
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