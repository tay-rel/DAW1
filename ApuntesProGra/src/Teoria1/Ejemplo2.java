package Teoria1;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		String nombre = "";
		
		int edad;
		
		
		System.out.print("Introduce tu nombre: ");
		nombre = teclado.nextLine();
		//tecladonextLine() ayuda a meter la informacion mediante
		//el teclado
		String nombre2;
		int edad2;
		
		System.out.print("Introduce tu edad: ");
		edad = teclado.nextInt();
		teclado.nextLine();
		
		System.out.print("Introduce nombre de la segunda persona: ");
		nombre2 =teclado.nextLine();
		
		System.out.print("Introduce la edad de la segunda persona: ");
		edad2= teclado.nextInt();
		
		
		System.out.println("*\nEl nombre es:" + nombre);
		
		System.out.println("La edad introduccion es: " + edad);
		
		System.out.println("*\n El nombre es: " + nombre2);
		System.out.println("La edad de introducion es: " + edad2);
		
		
		
		
		
		
	

	}

}
