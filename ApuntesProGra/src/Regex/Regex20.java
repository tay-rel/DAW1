package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "abc dfdgfdg asdrabcty";// texto
		String regex = "[a-zA-Z]{5,10}"; // Comprueba si en la cadena hay patrones formados por un mínimo de 5 letras,  
									// mayúsculas o minúsculas y un máximo de 10.

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
	}

}
