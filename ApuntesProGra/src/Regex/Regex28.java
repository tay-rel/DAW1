package Regex;
public class Regex28 {
//En este ejemplo se extrae el texto entre las etiqueta.
//practica 5 ejercicios para etiquetas
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Extrae el texto entre las etiquetas
		String regex = "(?i)(<titulo.*?>)(.+?)(</titulo>)";
		String actualizada = "<titulo>EJEMPLO_TEST</titulo>".replaceAll(regex, "$2").toLowerCase();
		
		System.out.println("Nuevo texto: "+actualizada);
	}

}
