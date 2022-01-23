package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex25 {
//para verificar gmail
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "pepe.al@gmail.com";// texto
		String regex = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
		// Comprueba si un correo electrónico es válido. Como referencia de los 
		// caracteres admitidos en una dirección de correo electrónico 

		// primera forma
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);
		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice:" + concordancias.start() + "(Texto: " + concordancias.group() + ")");
		}
		
	}

}
