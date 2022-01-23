package Metodos;
/* Ejemplo definición y llamada a método */

import java.util.Scanner;

public class Metodo6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine();
		
		System.out.print("Introduce el primer numero: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int num2 = teclado.nextInt();
		
		String mensaje = mostrarMensajeConNumero(texto, mayor(num1, num2));
		System.out.println(mensaje);
		
		teclado.close();
	}
	
	static int mayor(int a, int b) {
		if(a > b) {
			return a;
		}
		return b;
	}
	
	static String mostrarMensajeConNumero(String texto, int numero) {
		return texto + numero;
	}
}
