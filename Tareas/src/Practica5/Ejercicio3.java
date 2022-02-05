package Practica5;

import java.util.Scanner;

public class Ejercicio3 {

	/*
	 * La funcion .indexOf() nos devuelve la posicion, mediante un numero entero, de
	 * una cadena o un caracter dentro de una cadena de texto nada. En el caso de
	 * que el caracter o la cadena no exista se devuelve un -1
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "Estamos viviendo en un submarino amarillo.\n No tenemos nada que hacer. En el interior del submarino\n se esta¡ muy apretado.\n Asi que estamos leyendo todo el dia. Vamos a salir en 5 dias\".";

		String pedirPalabra = "en";

		System.out.println(cadena);
		System.out.println("\nLa palabra " + " '" + pedirPalabra + " '" + " se repite: "
				+ obtenerNumeroVecesSubCadena(cadena, pedirPalabra));

	}

	public static int obtenerNumeroVecesSubCadena(String cadena, String subcadena) {

		return cadena.split(subcadena).length - 1;

	}
}
