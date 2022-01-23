package Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex06 {

	public static void main(String[] args) {
		String texto="abc de mareosta";//texto
		 String regex="mar...";	//comprueba si termina exactamenete 
		 						//El punto nos indica lo que vendra despues
		 
		 //primera forma
		 Pattern patron=Pattern.compile(regex);
		 Matcher concordancias=patron.matcher(texto);
		 System.out.println("\nConcordancias: ");
		 while(concordancias.find()) {
			 System.out.println("Indice:" +concordancias.start()+"(Texto: "+concordancias.group()+")");
		 }
		

	}

}
