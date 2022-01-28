package Practica5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="�Estamos viviendo en un <mayus>submarino amarillo</mayus>.\n"
				+ " No tenemos <mayus>nada</mayus> qu� hacer\"";
		
		
		System.out.println(PasarMay�sculaSubCadena(text));
		
		
	}
	public static String PasarMay�sculaSubCadena(String text) {
		String regex="(?i)(<mayus.*?>)(.+?)(</mayus>)";
		
		
		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(text);
		
		while (concordancias.find()) {
			
			text=text.replaceFirst(regex, concordancias.group(2).toUpperCase());
		}
		
		return text;
	}
	

}
