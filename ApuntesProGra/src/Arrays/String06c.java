package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

import java.util.Scanner;

public class String06c {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//System.out.print("Introduce un texto: ");
		//String texto = teclado.nextLine();
		String texto = " 	casa-hola  .pajaro\navion";
		String[] palabras = texto.split("[-,_ ?.@\t\n]+");
		
		mostrarPalabras(palabras);
		teclado.close();
	}
	
	static void mostrarPalabras(String[] palabras) {
		for(int i = 0; i < palabras.length; i++) {
			if(palabras[i].length() > 0) {
				System.out.println(palabras[i]);
			}
		}
	}
}