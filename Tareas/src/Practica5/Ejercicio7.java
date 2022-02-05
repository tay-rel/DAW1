package Practica5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "“Oracle ha anunciado hoy su nueva generación de compilador Java hoy.\n Utiliza analizador avanzado y optimizador especial para la JVM de Oracle”";
		String ter = "JVM,Java,Oracle";

		System.out.println(reemplazarPalabras(text, ter));

	}

	public static String reemplazarPalabras(String text, String reemplaza) {
		String[] separar = reemplaza.split(",");
		String[] cadena2 = text.replace(".", "").replace("\n", "").split(" ");
		String aux = "";

		for (int i = 0; i < separar.length; i++) {
			for (int j = 0; j < separar[i].length(); j++) {
				aux += "*";

			}
			text = text.replaceAll(separar[i], aux);

			aux = "";
		}

		return text; // devuelve texto formateado */
	}

}
