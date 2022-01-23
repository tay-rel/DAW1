package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "abc del mar";// texto
		String regex = "^abc.*"; // tiene que empezar si o si por "abc"
									// opcionalmente precedido o seguido

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
	}

}
