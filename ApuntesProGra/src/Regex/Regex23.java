package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "abc dfdgfdg asdrabcty";// texto
		String regex = "(d|g)"; // Comprueba si la cadena contienen los caracteres a ó b  
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
