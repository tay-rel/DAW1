package Practias2;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num = 0;

		do {

			// MENU
			System.out.println("\t MENÚ");
			System.out.println("1: Sumar");
			System.out.println("2: Restar");
			System.out.println("3: Multiplicar");
			System.out.println("4: Dividir");
			System.out.println("0: Terminar\n");

			num = entrada.nextInt();
			int operacion1, operacion2;

			switch (num) {

			case 1:
				System.out.println("Introduzca el primer número");
				operacion1 = entrada.nextInt();
				System.out.println("Introduzca el segundo numero");
				operacion2 = entrada.nextInt();
				System.out.println("Resultado: " + (operacion1 + operacion2));

				break;
			case 2:
				System.out.println("Introduzca el primer número");
				operacion1 = entrada.nextInt();
				System.out.println("Introduzca el segundo numero");
				operacion2 = entrada.nextInt();
				System.out.println("Resultado: " + (operacion1 - operacion2));
				break;
			case 3:
				System.out.println("Introduzca el primer número");
				operacion1 = entrada.nextInt();
				System.out.println("Introduzca el segundo numero");
				operacion2 = entrada.nextInt();
				System.out.println("Resultado: " + (operacion1 * operacion2));
				break;
			case 4:
				System.out.println("Introduzca el primer número");
				operacion1 = entrada.nextInt();
				System.out.println("Introduzca el segundo numero");
				operacion2 = entrada.nextInt();
				System.out.println("Resultado: " + (operacion1 / operacion2));
				break;
			case 0: System.out.println(" Has finalizado ");
				
				break;

			}
		} while (num != 0);
	}

}
