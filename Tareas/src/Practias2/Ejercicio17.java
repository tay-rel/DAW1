package Practias2;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner teclado=new Scanner(System.in);
	
	System.out.println("Escribe el número: ");
	int n =teclado.nextInt();
	
	if(n >=0 && n<=50) {
		//linea superior
		for(int i = 0; i < n; i++) {
			System.out.print(" * ");
			
		}
		System.out.println();
		
		//centro de la forma
		for(int i = 0; i < n-2; i++ ) {
			
			System.out.print(" * ");
			
			for(int j=0; j < n-2; j++) {
				System.out.print("   ");
				
			}
			System.out.println(" * ");
		}
		
		//linea inferior
		for(int i = 0; i < n; i++) {
			System.out.print(" * ");
		}
		
		
		
		
		
	}
	
	}

}

