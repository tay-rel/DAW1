package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex08 {

	public static void main(String[] args) {
	
		String texto = "0123 aadd_  + / d1?f";// texto
		String regex = "\\w"; // W cualquier carcateres no alfabeticos ? incluye carcateres especiales
									// w 

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}

		
		

	}

}
