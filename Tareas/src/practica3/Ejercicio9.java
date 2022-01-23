package practica3;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangulo();
	}

	static void triangulo() {
		int num;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		num = entrada.nextInt();
		int contador = 0;
		
		System.out.println();
		for (int i = 0; i < num; i++) {

			for (int j = num - 1 - i; j >= 0; j--) {
				System.out.print(" ");
			}
			
			for (int j = 0; j <= contador; j++) {
				System.out.print("*");
			}
			contador += 2;
			System.out.println("");
			System.out.println("");
		}
	}
}
