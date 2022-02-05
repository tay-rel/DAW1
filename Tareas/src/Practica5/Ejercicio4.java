package Practica5;


import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entry = new Scanner(System.in);
		String cadena = "Estamos viviendo en un submarino amarillo.\n No tenemos nada que hacer. En el interior del submarino\n se esta¡ muy apretado.\n Asi que estamos leyendo todo el dia. Vamos a salir en 5 dias\".";
		
		System.out.println(cadena);
		
		System.out.print("\nIntroduzca la palabra: ");
		String palabra = entry.nextLine();

		System.out.println("\nLa palabra " + " '" + palabra + " '" + " se repite: "
				+ obtenerNumeroVecesSubCadena2(cadena, palabra));

	}

	public static int obtenerNumeroVecesSubCadena2(String cadena, String subcadena) {

	
		return cadena.toUpperCase().split(subcadena.toUpperCase()).length-1;
	}

}


