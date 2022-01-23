package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

import java.util.Scanner;

public class String05b {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Cuántas palabras quieres introducir? ");
		int cantidad = teclado.nextInt();
		String[] palabras = pedirPalabras(cantidad);
		
		mostrarPalabras(palabras);
		teclado.close();
	}
	
	static String[] pedirPalabras(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		String[] palabras = new String[cantidad];
		for(int i = 0; i < palabras.length; i++) {
			System.out.print((i+1) + "º palabra: ");
			palabras[i] = teclado.nextLine();
		}
		teclado.close();
		return palabras;
	}
	
	static void mostrarPalabras(String[] palabras) {
		for(int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}
}