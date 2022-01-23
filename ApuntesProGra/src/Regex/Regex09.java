package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "0123*aadd_  + / d1?f";// texto
		String regex = "\\b"; // Limite de una palabra.Indica en que empieza o acaba
									// una palabra separada por espacios en blanco

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
	}

}
