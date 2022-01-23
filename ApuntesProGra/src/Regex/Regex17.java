package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "sdfgabcd ggg";// texto
		String regex = ".*abc.*"; // comprueba si contiene el patron"abc"
									// opcionalmente precedido o seguido mientras exista abc

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
	}

}
