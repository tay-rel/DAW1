package Metodos;/* Ejemplo definición y llamada a método */

import java.util.Scanner;

public class Metodo5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int numero = teclado.nextInt();
		
		if(esPar(numero)) {
			System.out.println(numero + " es par");
		} else {
			System.out.println(numero + " es impar");
		}
		
		teclado.close();
	}
	
	static boolean esPar(int numero) {
		return (numero % 2 == 0);
	}
}
