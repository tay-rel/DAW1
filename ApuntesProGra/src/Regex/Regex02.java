package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {

	public static void main(String[] args) {
		
		String texto="aa.ssdd.asddd.asd";//texto con  letras
		 String regex="asd";	//comprueba si tiene exactamenete el patron
		 
		 //primera forma
		 Pattern patron=Pattern.compile(regex);
		 Matcher concordancias=patron.matcher(texto);
		 System.out.println("\nConcordancias: ");
		 while(concordancias.find()) {
			 System.out.println("Indice:" +concordancias.start()+"(Texto: "+concordancias.group()+")");
		 }
		 
	}

}
