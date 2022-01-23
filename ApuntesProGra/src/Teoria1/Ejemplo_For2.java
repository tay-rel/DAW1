package Teoria1;
import java.util.Scanner;

public class Ejemplo_For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Tabla de multiplicar del: ");
		int num =teclado.nextInt();
		
		for (int i = 1 ; i <= 10; i++){
			
			System.out.println(num  + " x " + i + " = " + (num*i));
		}
	}

}
