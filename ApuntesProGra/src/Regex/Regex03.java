package Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex03 {
	 public static String regex="^aa";
	public static void main(String[] args) {
		
		
		System.out.println("Introduce el texto: ");
	
		//boolean a =prueba(regex);
		System.out.println("Es  "+ prueba(regex));
		
	}
		public static boolean prueba(String text) {
			/*Scanner entry=new Scanner(System.in);
			String texto=entry.nextLine();*/
			
		
		 //String texto="aa.ssdd.asddd.asd";//texto con  letras
		 ;	//comprueba si tiene exactamenete el patron ^aa
		 						//sirve para comprabar si la primera letra esta en mayuscula
		 
		 //primera forma
		 Pattern patron=Pattern.compile(regex);
		 Matcher concordancias=patron.matcher(text);
		 //System.out.println("\nConcordancias: ");
		 
		
		 
		 while(concordancias.find()) {
			//System.out.println("Indice:" +concordancias.start()+"(Texto: "+concordancias.group()+")");
			 return true;
		
		 }
		 
		return false;
		// return text.matches(regex) ? true : false;
	}

}
