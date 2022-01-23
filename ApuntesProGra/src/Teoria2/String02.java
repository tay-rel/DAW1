package Teoria2;
import java.util.Scanner;

public class String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);

		String texto="Esto es un texto";
		
		System.out.println("Cantidad de caracteres: "+texto.length());//es un metodo	
		mostrarCadenaLetra(texto);		
		
		entrada.close();
		
	}
	static void mostrarCadenaLetra(String texto) {
		
		for(int i=0;i<texto.length();i++) {
			System.out.println(texto.charAt(i));//char nos devuelve lo que hay en esa posicion
			
		}	
	
	}

}
