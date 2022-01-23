package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

import java.util.Scanner;

public class String03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Escribe un texto: ");
		String texto = teclado.nextLine();
		
		System.out.println("Cantidad de caracteres: " + texto.length());
		mostrarCadaLetra(texto);
		
		teclado.close();
	}
	
	static void mostrarCadaLetra(String texto) {
		for(int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}
}