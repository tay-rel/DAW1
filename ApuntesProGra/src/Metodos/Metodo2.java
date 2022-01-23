package Metodos;
/* Ejemplo definición y llamada a método */

import java.util.Scanner;

public class Metodo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int numero1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo número: ");
		int numero2 = teclado.nextInt();
		
		System.out.print("Introduce el tercer número: ");
		int numero3 = teclado.nextInt();
		
		System.out.print("Introduce el cuarto número: ");
		int numero4 = teclado.nextInt();
		
		int resultado1 = mayor(numero1, numero2);
		int resultado2 = mayor(numero3, numero4);
		int resultadoFinal = mayor(resultado1, resultado2);
		
		System.out.println("El mayor es " + resultadoFinal);
		
		teclado.close();
	}
	
	static int mayor(int a, int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
}
















/*public class Metodo2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int numero1 = teclado.nextInt();
		System.out.print("Introduce el segundo número: ");
		int numero2 = teclado.nextInt();
		
		int resultado = mayor(numero1, numero2);
		
		System.out.println("1- El mayor es " + resultado);
		
	}
	
	static int mayor(int a, int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
}*/