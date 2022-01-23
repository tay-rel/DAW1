package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "01 a2a 223";// texto
		String regex = "\\d+"; // comprueba al menos
									// si tiene un numero de carcateres numericos

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}

	}

}
