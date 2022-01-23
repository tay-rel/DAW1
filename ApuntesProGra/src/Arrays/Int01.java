package Arrays;


/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

public class Int01 {
	public static void main(String[] args) {
		int[] numeros = {2, 5, 4, 6, 7};	// Array de numeros enteros
		mostrarArray(numeros);		// Mostrar array
	}
	
	static void mostrarArray(int[] numeros) {
		String serie = "";
		for(int i = 0; i < numeros.length; i++) { // La propiedad "length" indica la cantidad de numeros
			serie += numeros[i];
			if(i < numeros.length - 1) { serie += ","; }
		}
		System.out.println(serie);
	}
}