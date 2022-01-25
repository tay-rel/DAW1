package Practica5;


import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * La función .indexOf() nos devuelve la posición, mediante un número entero, de
	 * una cadena o un carácter dentro de una cadena de texto nada. En el caso de
	 * que el carácter o la cadena no exista se devuelve un -1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "“Estamos viviendo en un submarino amarillo.\n No tenemos nada que hacer. En el interior del submarino\n se está muy apretado.\n Así que estamos leyendo todo el día. Vamos a salir en 5 días\".";

		String pedirPalabra = "en";

		System.out.println(cadena);
		System.out.println("\nLa palabra " + " '" + pedirPalabra + " '" + " se repite: "
				+ obtenerNumeroVecesSubCadena(cadena, pedirPalabra));

	}

	public static int obtenerNumeroVecesSubCadena(String cadena, String subcadena) {

		int contador = 0;
		int limiteSb = subcadena.length();

		while (cadena.indexOf(subcadena) != -1) {
			cadena = cadena.substring(cadena.indexOf(subcadena) + limiteSb, cadena.length());
			contador++;
		}
		return contador;

	}
}
