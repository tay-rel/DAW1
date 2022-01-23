package Teoria1;
import java.util.Scanner;

public class Ejemplo_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		//while evalua antes de hacer
		while(num<=10) {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
			
			System.out.println("Ultimo numero es: " + num);
			
		}
			System.out.println("FIN DEL PROGRAMA");
	}

}
