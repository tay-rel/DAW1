package Teoria2;
import java.util.Scanner;
/*Ejemplo definición y llamada a metodo
 * 
 * 
 * crear metodo que calcule el porcentaje de un numero
 */

public class Ejemplo_Metodo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		double numero=teclado.nextDouble();
		System.out.print("Introduce un porcentaje para calcular: ");
		double porcentaje=teclado.nextDouble();
		
		double resultado=calcularPorcentaje(numero,porcentaje);
		System.out.print("el "+porcentaje+" % de "+numero+"es " +resultado);
				
		
		teclado.close();
	}
	static double calcularPorcentaje(double numero,double porcentaje) {
		double resultado=(numero/100)*porcentaje;
		return resultado;
		
	
	
	
	}

}
