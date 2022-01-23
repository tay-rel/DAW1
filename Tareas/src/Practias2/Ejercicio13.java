package Practias2;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner teclado =new Scanner(System.in);
		 int mayor=Integer.MIN_VALUE;
		 int actual;
		 String continuar="";
		 do {
			 System.out.println("Introduce un numero: ");
			 actual=teclado.nextInt(); teclado.nextLine();
			 if(actual>mayor) {
				 mayor=actual;
			 }
			 System.out.println("S para continuar");
			 continuar=teclado.nextLine();
		 }while(continuar.equalsIgnoreCase("S"));
			//meter un .trim(). al texto 
		 
		System.out.println("El mayor es: " + mayor);	 
		 
	}
}
