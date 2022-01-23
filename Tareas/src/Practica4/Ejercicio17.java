import java.util.Arrays;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 5, 7, 5, 4, 7, 5, 3, 0, 215, 1, 4, 68, 8479 };

		// int array1[]= {1,2,3,4,5,6};

		System.out.println(Arrays.toString(array));

		System.out.print("\nArray  = ");

		int valido = ordenarBaraja(array);
		System.out.println(valido);

		ordenarBaraja(array);
		System.out.println(Arrays.toString(array));

	}

	static int ordenarBaraja(int array[]) {

		int compara[] = array.clone(); //duplica un array
		int aux = 0;

		try {

			for (int i = 1; i < array.length; i++) { //compara desde el segundo
				aux = array[i];
				int j = i - 1;
				
				while(array[j] > aux && j > 1) {
					array[j + 1] = array[j];
					j = j - 1;
				}
				
				if(array[j] > aux) {
					array[j + 1] = array[j];
					array[j] = aux;
				}
				else {
					array[j + 1] = aux;
				}
			}
			
			if(Arrays.equals(array, compara)) { //compara un array
				return 0;
			}
			

		} catch (Exception e) {
			return -1; // si no ha ordenado
		}

		return 1; // si ha ordenado
	}

}
