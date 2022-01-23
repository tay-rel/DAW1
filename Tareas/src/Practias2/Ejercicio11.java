package Practias2;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard=new Scanner(System.in);
		
		System.out.print("Introduce capital inicial: ");
		double capital=keyboard.nextDouble();
		System.out.print("Introduce el interes anual: ");
		double interes=keyboard.nextDouble() / 100;
		System.out.print("Introduce el numero de años: ");
		int anios=keyboard.nextInt();
		
		double Cf=capital * Math.pow(1 + interes, anios);
		
		System.out.println("\nCapital inicial: " + capital + "euros");
		System.out.println("Interes anual:" + (interes * 100) + "%");
		System.out.println("Años: " + anios);
		System.out.println("Interes producido: " + (Cf - capital));
		System.out.println("Interes Final: " + (capital * Math.pow (1 + interes,anios)));
	}

}
