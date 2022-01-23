import java.util.Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
	
		int[] vector={4, 3, 1, 4, 2, 5, 8};
		int[] secuencia={4, 2, 5};
		
		System.out.println("1. "+Arrays.toString(vector));
		System.out.println("2. "+(Arrays.toString(secuencia)));
		
		String posicion=buscarSecuenciaInt(vector, secuencia);
		System.out.println("La secuencia empieza en la posicion: "+posicion);
		
	}	
	static String buscarSecuenciaInt(int[] vector, int[] secuencia) {

		for (int i = 0; i < vector.length -secuencia.length +1 ; i++) {

			int[] vectorComprobar = new int[secuencia.length];
			int aux = i;

			for (int j = 0; j < secuencia.length ; j++) {
				vectorComprobar[j] = vector[aux];
				aux++;
			}

			if (comprobarVectoresIguales(vectorComprobar, secuencia)) {
				return String.valueOf(i);
			}
		}
		return "No coinciden";
	}

	static boolean comprobarVectoresIguales(int[] vector, int[] vector2) {

		for (int i = 0; i < vector2.length; i++) {
			if (vector[i] != vector2[i]) {
				return false;
			}
		}
		return true;
	}
}
