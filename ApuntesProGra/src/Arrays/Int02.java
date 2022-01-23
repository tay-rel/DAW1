package Arrays;


/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

public class Int02 {
	public static void main(String[] args) {
		int[] numeros = {2, 5, 4, 6, 0, 7, 9, 1, 3, 8};
		mostrarArray(numeros);
		
		int[] numerosOrdenados = ordenarNumeros(numeros);

		mostrarArray(numerosOrdenados);
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