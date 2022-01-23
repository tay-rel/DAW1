package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex04 {

	public static void main(String[] args) {
		String texto="aa.ssdd.asddd.asd";//texto
		 String regex="sd$";	//comprueba si termina exactamenete el patron sd$
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
