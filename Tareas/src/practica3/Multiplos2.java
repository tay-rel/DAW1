package practica3;
import java.util.Scanner;
//EJERCICIO2
public class Multiplos2 {

	public static void main(String argumentos[]) {
			int TOPE=100;
			mostrarMultiplos2(TOPE);	//llama el metodo
			
		}
		
		static void mostrarMultiplos2(int TOPE) {
			
			// Declaración de variables
					Scanner teclado = new Scanner(System.in);
					//final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
					int mult  ;							// Almacena el múltiplo calculado
					int cont  ;							// Contador utilizado en el cálculo

					// Inicializa las variables
					mult = 0 ;
					cont = 0 ;

					System.out.println("\t Múltiplos de 2\n");
					while (mult < TOPE)					// Bucle de cálculo y visualización
					{
						mult = cont * 2;
						System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
						++cont;
					}
					teclado.close();
				
	
	
	}

}
