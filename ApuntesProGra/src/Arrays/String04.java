package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

import java.util.Scanner;

public class String04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un texto: ");
		String texto = teclado.nextLine();
				
		mostrarPalabras(texto);
		
		teclado.close();
	}
	
	static void mostrarPalabras(String texto) {
		String palabras = "";
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) != ' ') {
				palabras += texto.charAt(i);
			} else {
				palabras += '\n';
			}
		}
		System.out.println(palabras);
	}
}