package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

public class String01 {
	public static void main(String[] args) {
		String[] palabras = {"Hola", "esto", "es", "una", "cadena"};
		
		mostrarPalabras(palabras);
	}
	
	static void mostrarPalabras(String[] palabras) {
		for(int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}
}