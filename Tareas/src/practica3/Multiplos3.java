package practica3;
import java.util.Scanner;

public class Multiplos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaración de variables	
		
		int TOPE = pedirTope(); 		

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
		
		
		//teclado.close();
			
	}
	///solo pide cosas no devuelve nada
	static int pedirTope() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el tope: ");
		int TOPE=teclado.nextInt();
		//devuelve un valor de tipo entero
		return TOPE;
		
	
	
	}

}
