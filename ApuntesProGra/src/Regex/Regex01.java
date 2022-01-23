package Regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {

	public static void main(String[] args) {
		 String texto="012ab9c";//texto con numero y letras
		 String regex="\\d";	//Cualquier numero del 0-9. Equivale 
		 //primera forma
		 Pattern patron=Pattern.compile(regex);
		 Matcher concordancias=patron.matcher(texto);
		 System.out.println("\nConcordancias: ");
		 while(concordancias.find()) {
			 System.out.println("Indice:" +concordancias.start()+"(valor: "+concordancias.group()+")");
		 }
		 
		 
	}

}
