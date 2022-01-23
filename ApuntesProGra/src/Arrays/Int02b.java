package Arrays;


/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

public class Int02b {
	static final int milisegundos = 500;
	
	public static void main(String[] args) throws InterruptedException {
		int[] numeros = {2, 5, 4, 6, 0, 7, 9, 1, 3, 8};
		mostrarArray(numeros);
		
		int[] numerosOrdenados = ordenarNumeros(numeros);
		
		System.out.println("\nArray ordenado");
		mostrarArray(numerosOrdenados);
	}
	
	static int[] ordenarNumeros(int[] numeros) throws InterruptedException {
		int aux;
		for(int i = 0; i < numeros.length; i++) {
			for(int j = i; j < numeros.length; j++) {
				if(numeros[j] < numeros[i]) {
					mostrarArrayPosicion(numeros, i, j);
					Thread.sleep(milisegundos);
					aux = numeros[j];
					numeros[j] = numeros[i];
					numeros[i] = aux;
					mostrarArrayPosicion(numeros, i, j);
					Thread.sleep(milisegundos);
				}
			}
		}
		System.out.println("\n\n\n\n\n\n\n\n\n");
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
	
	static void mostrarArrayPosicion(int[] numeros, int first, int second) {
		String serie = "", posicion = "";
		for(int i = 0; i < numeros.length; i++) {
			if(i == first) {
				posicion += "i ";
			} else if(i == second) {
				posicion += "j ";
			} else { posicion += "  "; }
		}
		for(int i = 0; i < numeros.length; i++) {
			serie += numeros[i];
			if(i < numeros.length - 1) { serie += ","; }
		}
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println(posicion);
		System.out.println(serie);
	}
}