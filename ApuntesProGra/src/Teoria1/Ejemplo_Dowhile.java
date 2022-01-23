package Teoria1;


import java.util.Scanner;

public class Ejemplo_Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		do {
			System.out.println("Introduce un numero: ");
			num = teclado.nextInt();
			System.out.println("Ultimo numero es: " + num);
		} while(num<=10); 
			System.out.println("FIN DEL PROGRAMA");
		
	

	}

}
