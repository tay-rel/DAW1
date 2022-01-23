package Teoria1;
import java.util.Scanner;

public class Ejemplo4_par_impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner teclado = new Scanner(System.in);	
	
	int num1;
	
	String texto1;
	
	
	System.out.print("Introduce el numero: ");
	texto1 = teclado.nextLine();
	num1 = Integer.parseInt(texto1);
	
	
	if(num1 % 2  == 0) {
		//par
	
		System.out.print("El numero es par ");
		
	}else {
		//impar
		
		System.out.print("El numero es impar ");
		
		}
	}
	
	
	
		
		
		
		
		
		
		
		
		
		

	}


