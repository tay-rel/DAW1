package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex21 {

	public static void main(String[] args) {
		
		String texto = "abc dfdgfdg asdrabcty";// texto
		String regex = "^[^\\d].*"; // comprueba si la cadena no empieza por un dígito  
									// caracteres.

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}

	}

}
