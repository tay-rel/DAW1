package Teoria1;
import java.util.Scanner;

public class Ejemplo_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for(int i=1; i<=10; i++) {
			
			//System.out.println("Hola" + (1 +i));
		//}
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Introduce el numero de veces: ");
		
		int veces =teclado.nextInt();
		
		for (int i = 1; i <= veces; i++){
		
		System.out.println("Hola" + (1 +i));
		
		}
		
		
	}

}
