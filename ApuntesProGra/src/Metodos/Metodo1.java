package Metodos;


/* Ejemplo definición y llamada a método */

import java.util.Scanner;

public class Metodo1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero = teclado.nextInt();
		
		System.out.print("Introduce un texto: ");
		int numero2 = teclado.nextInt();
		
		muestraMensaje(numero, numero2);
		
		teclado.close();
	}
	
	static void muestraMensaje(int num1, int num2) {
		System.out.println("El numero recibido es " + num1);
		System.out.println("El segundo numero recibido es " + num2);
	}
}













/*public class Metodo1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int numero = teclado.nextInt();
		System.out.print("Introduce un segundo numero: ");
		int numero2 = teclado.nextInt();
		
		mostrarNumero(numero, numero2);	// Llamada al método
	}
	
	static void mostrarNumero(int num, int num2) {	// Definición del método
		System.out.println("Hola " + num);
		System.out.println("Segundo numero " + num2);
	}
}*/