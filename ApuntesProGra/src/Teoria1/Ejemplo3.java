package Teoria1;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		String texto1, texto2;
		
		System.out.print("Introduce el primer numero: ");
		texto1 = teclado.nextLine();
		num1 = Integer.parseInt(texto1);
		
		System.out.print("Introduce el segundo numero: ");
		texto2 = teclado.nextLine();
		num2 = Integer.parseInt(texto2);
		
		
		if(num1 > num2) {
			
			System.out.print("El mayor es " + num1);
			
		} else if(num2 > num1) {
			System.out.print("El mayor es " + num2);
			
		} else {
			System.out.print("Los dos numeros son iguales");
			
		  	  
		  }
		}
		
		
		
		
		
		
		
		

	}

