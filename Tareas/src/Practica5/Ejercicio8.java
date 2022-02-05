package Practica5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = "http://www.devbg.org/forum/index.php";

		System.out.println(separarURL(cadena));
	}

	public static String separarURL(String cadena) {
		// String aux="^(?:([^:]):(?://)?)?([^/])(/.*)?";
		String[] separar1 = cadena.split("(://|/)", 3);

		System.out.println("Longitud: " + separar1.length);

		for (int i = 0; i < separar1.length; i++) {

			if (i != separar1.length - 1) {
				System.out.println("Respuesta [ " + i + "]" + separar1[i]);

			} else {
				System.out.println("Respuesta [ " + i + "]" + "/" + separar1[i]);
			}

		}

		return cadena;
	}

}
