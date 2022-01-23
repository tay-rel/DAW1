package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

public class String02 {
	public static void main(String[] args) {
		String texto = "Esto es un texto";
		
		System.out.println("Cantidad de caracteres: " + texto.length());
		mostrarCadaLetra(texto);
	}
	
	static void mostrarCadaLetra(String texto) {
		for(int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}
}