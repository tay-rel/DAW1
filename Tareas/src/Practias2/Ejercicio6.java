package Practias2;

import java.util.Scanner;
//debo utilizar importar escanner,para que lo lea

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Introduce el primer numero: ");

		int num1 = keyboard.nextInt();

		System.out.println("Introduce el segundo numero: ");

		int num2 = keyboard.nextInt();

		System.out.println("Introduce el tercer numero: ");

		int num3 = keyboard.nextInt();
		int aux;

		if (num2 < num1) {
			aux = num2;
			num2 = num1;
			num1 = aux;
		}
		if (num3 < num1) {
			aux = num3;
			num3 = num1;
			num1 = aux;
		}
		if (num3 < num2) {
			aux = num3;
			num3 = num2;
			num2 = aux;
		}
		System.out.println("\nNumeros ordenadores: " + num1 + " " + num2 + " " + num3);

	}

}
