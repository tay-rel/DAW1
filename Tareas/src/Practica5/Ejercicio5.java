package Practica5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="“Estamos viviendo en un <mayus>submarino amarillo</mayus>.\n"
				+ " No tenemos <mayus>nada</mayus> qué hacer\"";
		
		
		System.out.println(PasarMayúsculaSubCadena(text));
		
		
	}
	public static String PasarMayúsculaSubCadena(String text) {
		String regex="(?i)(<mayus.*?>)(.+?)(</mayus>)";
		String actualizada = "<mayus>submarino amarillo /<mayus>".replaceAll(regex,text ).toUpperCase();
		
		Pattern patron = Pattern.compile(actualizada,Pattern.CASE_INSENSITIVE);
		Matcher concordancias = patron.matcher(text);
		System.out.println(text);
		
		
		while (concordancias.find()) {
			
			 System.out.println(concordancias);
		}
		
		return actualizada;
	}
	

}
