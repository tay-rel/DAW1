package Metodos;


/* Ejemplo definición y llamada a método */

import java.util.Scanner;

public class Metodo4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Tu nombre: ");
		String name = teclado.nextLine();
		
		System.out.print("Tus apellidos: ");
		String surname = teclado.nextLine();
		
		System.out.print("Tu edad: ");
		int age = teclado.nextInt();
		
		String texto = formarNombre(name, surname, age);
		System.out.println(texto);
		
		teclado.close();
	}
	
	static String formarNombre(String nombre, String apellidos, int edad) {
		return "Tu nombre es " + nombre + " " + apellidos + "\nTu edad es " + edad;
	}

}
