package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex03 {

	public static void main(String[] args) {
		
		String texto="aa.ssdd.asddd.asd";//texto con  letras
		 String regex="^aa";	//comprueba si tiene exactamenete el patron ^aa
		 						//sirve para comprabar si la primera letra esta en mayuscula
		 
		 //primera forma
		 Pattern patron=Pattern.compile(regex);
		 Matcher concordancias=patron.matcher(texto);
		 System.out.println("\nConcordancias: ");
		 while(concordancias.find()) {
			 System.out.println("Indice:" +concordancias.start()+"(Texto: "+concordancias.group()+")");
		 }
		
		
		
	}

}
