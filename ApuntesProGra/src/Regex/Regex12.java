package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "pepe@gmail.com";// texto
		String regex = "[^@]+"; // comprueba si los caracteres que no sean arroba
									// 

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
	}

}
