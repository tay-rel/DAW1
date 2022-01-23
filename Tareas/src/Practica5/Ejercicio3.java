package Practica5;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena ="“Estamos viviendo en un submarino amarillo.\n No tenemos nada que hacer."
				+ " En el interior del submarino se está muy apretado.\n Así que estamos leyendo todo el día."
				+ " Vamos a salir en 5 días\".";
		
		String pedirPalabra="en";
		
		System.out.println(cadena);
		System.out.println("\nLa palabra "+" '" + pedirPalabra+" '"+" se repite: "+obtenerNumeroVecesSubCadena(cadena, pedirPalabra));
		
		
	}
	
	public static int obtenerNumeroVecesSubCadena(String cadena ,String subcadena) {
		
		int contador=0;
		int veces=0;
		int busca =cadena.indexOf(subcadena, veces);
		StringBuilder contenido= new StringBuilder(cadena);
		
		for (int i = 0; i < cadena.length(); i++) {
			if() {
				contador ++;
			}
				
		}

		return contador;
		
	}

}
