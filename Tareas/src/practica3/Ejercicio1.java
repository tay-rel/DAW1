package practica3;


	// Multiplo1.java
	// Fecha: 02/11/2021
	// Autor/a: Ariel MS
	// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.

import java.util.Scanner;
public class Ejercicio1 {
	//estoy creando un método nuevo
	
	public static void main(String argumentos[]) {
		
		mostrarMultiplos1();
		
	}
	
	static void mostrarMultiplos1() {
		
		// Declaración de variables
				Scanner teclado = new Scanner(System.in);
				final int TOPE = 16  ; 				// Constante, el máximo valor del múltiplo
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
	


