package Practica5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println(padRight("Introduccion ", '*', 20));
		
		
	}
	public static String padRight(String text,char character,int finalnumber) {
	 StringBuilder formateado= new StringBuilder(text);
	 
		if(text.length()<finalnumber) { //si mi longitud de text es menor a number
			int saveChar=finalnumber-text.length(); //guardo la resta de ambos
			
			for (int i = 0; i < saveChar; i++) { //recorro lo que hay en saveChar y 
				formateado.append(character); //Añade a esta secuencia la representación de la cadena de caracteres del argumento. 
			}
			
		}else {
			return "La operacion no es valida";
		}
	
		return formateado.toString(); //devuelve texto formateado con char por la derecha
	}
	

}
