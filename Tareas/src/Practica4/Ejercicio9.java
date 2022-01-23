import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vector = { 4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3 };

		System.out.println(Arrays.toString(vector)+"= "+masFrecuente(vector));
	}
	static int masFrecuente(int[] vector) {

		int[] repeticionDelValor = new int[vector.length];

		for (int i = 0; i < vector.length; i++) {

			for (int j = 0; j < vector.length; j++) {

				if (vector[i] == vector[j]) {

					repeticionDelValor[i]++;
				}
			}
		}
		int mayor = 0;
		int masRepetido = 0;

		for (int i = 0; i < repeticionDelValor.length; i++) {

			if (repeticionDelValor[i] > mayor) {

				mayor = repeticionDelValor[i];
				masRepetido = i;
			}
		}

		return vector[masRepetido];
	}

}