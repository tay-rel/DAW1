package Arrays;

/* David Munuera Sánchez
 * 1º DAM / 1º DAW
 */

public class Int05 {
	public static void main(String[] args) {
		int[][] matriz = { {1,2,3,4}, {5,6,7,8}, {9,0,1,2}, {3,4,5,6} };	// Array de 2 dimensiones
		mostrarArrayMulti(matriz);		// Mostrar array de 2 dimensiones
	}
	
	static void mostrarArrayMulti(int[][] numeros) {
		String serie = "";
		for(int i = 0; i < numeros.length; i++) { // La propiedad "length" indica la cantidad de numeros
			for(int j = 0; j < numeros[i].length; j++) {
				serie += numeros[i][j];
				if(j < numeros[i].length - 1) { serie += ","; }
			}
			serie += "\n";
		}
		System.out.println(serie);
	}
}