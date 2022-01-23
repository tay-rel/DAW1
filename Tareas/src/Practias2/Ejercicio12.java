package Practias2;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		
		int total= 0;
		for(int i = 1; i <= 8; i++) {
			
			System.out.println("Introduce el " + i + " numero: " );
			total  += keyboard.nextInt();
			
		}
		
		System.out.print("El final: " + total);
		keyboard.close();
	}

}
