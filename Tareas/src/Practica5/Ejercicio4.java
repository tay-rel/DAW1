package Practica5;


import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entry = new Scanner(System.in);
		String cadena = "“Estamos viviEndo En un submarino amarillo.\n No tEnemos nada que hacer. En el interior del submarino se está muy apretado.\n Así que estamos leyEndo todo el día. Vamos a salir En 5 días\".";

		System.out.print("\nIntroduzca la palabra: ");
		String palabra = entry.nextLine();

		System.out.println(cadena);
		System.out.println("\nLa palabra " + " '" + palabra + " '" + " se repite: "
				+ obtenerNumeroVecesSubCadena2(cadena, palabra));

	}

	public static int obtenerNumeroVecesSubCadena2(String cadena, String subcadena) {

		int contador = 0;
		String aux = ""; // forma las pequeñas subcadenas para comparar
		int limiteSb = subcadena.length();

		for (int i = 0; i <= cadena.length() - limiteSb; i++) { // recorro cadena - limiteSb
			aux = cadena.substring(i, i + limiteSb);

			if (subcadena.equalsIgnoreCase(aux)) {
				contador++;
			}

			aux = " ";// Para evaluar de nuevo la cadena el aux debe estar limpio

		}
		return contador;
	}

}
