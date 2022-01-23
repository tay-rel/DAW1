package practica3;
import java.util.Scanner;

public class Multiplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mostrarMultiplos2(pedirTope());//llamando a los metodos

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
	//solo pide cosas no devuelve nada
	static int pedirTope() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el tope: ");
		int TOPE=teclado.nextInt();
		//devuelve un valor de tipo entero
		return TOPE;
		
	}

}
