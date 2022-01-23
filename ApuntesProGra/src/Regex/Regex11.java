package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "JavaWorld";// texto
		String regex = "a[Ww]orld"; // comprueba si la cadena contiene el grupo
									// la la a alguno que le des tu a seguida de una w o W

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
	}

}
