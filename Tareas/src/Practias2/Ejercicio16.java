package Practias2;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner(System.in);
		double num,decimales,potencia,redondeo,resultado;
		String continuar="S";
		while(continuar.trim().equalsIgnoreCase("S")) {
			System.out.println("Introduce un número: ");
			num=teclado.nextDouble();
			System.out.println("Introduce los decimales: ");
			decimales=teclado.nextDouble();
			potencia=Math.pow(10,decimales);
			redondeo=Math.rint(num*potencia);
			resultado=redondeo/potencia;
			System.out.println("Número leído: " + num);
			System.out.println("Decimales: " + decimales);
			System.out.println("Valor mostrado: " + resultado);
			
			System.out.println("Quieres terminar el programa.Preciona \"s\" para terminar:" );
			continuar=teclado.nextLine();
		}
		
		
	}

}
