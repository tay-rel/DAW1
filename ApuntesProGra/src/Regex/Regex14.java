package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "bab";// texto
		String regex = "[b?]"; // comprueba donde si aparece lab
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
