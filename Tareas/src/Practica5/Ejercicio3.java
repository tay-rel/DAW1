package Practica5;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena ="�Estamos viviendo en un submarino amarillo.\n No tenemos nada que hacer. En el interior del submarino se est� muy apretado.\n As� que estamos leyendo todo el d�a. Vamos a salir en 5 d�as\".";
		
		String pedirPalabra=" en ";
		
		System.out.println(cadena);
		System.out.println("\nLa palabra "+" '" + pedirPalabra+" '"+" se repite: "+obtenerNumeroVecesSubCadena(cadena, pedirPalabra));
		
		
	}
	
	public static int obtenerNumeroVecesSubCadena(String cadena ,String subcadena) {
		
		int contador=0;
		String aux=""; //forma las peque�as subcadenas para comparar
		int limiteSb= subcadena.length();
		
		for (int i = 0; i <= cadena.length() -limiteSb ; i++) { //recorro cadena - limiteSb
			aux=cadena.substring(i, i+limiteSb);
			
			if(subcadena.equals(aux)) {
				contador++;
			}
			aux=" ";//Para evaluar de nuevo la cadena el aux debe estar limpio
			
		}
		return contador;
		
	}

}
