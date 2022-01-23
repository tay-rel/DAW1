package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "JavaWorld";// texto
		String regex = "[0-9a-f]"; // comprueba si contiene numeros o letras de
									// la la a alguno que le des tu

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
	}

}
