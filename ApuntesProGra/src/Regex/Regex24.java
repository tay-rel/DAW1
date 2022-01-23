package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "abc dfdg13fdg asdrabcty";// texto
		String regex = ".*1[^2].*"; // Comprueba si la cadena contiene un 1 y ese 1 no está seguido por un 2  
									// opcionalmente va precedido o seguido de ninguno o varios caracteres.

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
		
		
		
	}

}
