package Teoria2;
import java.util.Arrays;
import java.util.Scanner;

public class Try_Catch04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		String[] words= {"Esto","es","un","texto"};
		
		System.out.println("Array -> "+Arrays.toString(words));
		
		System.out.println("Indica una posicion del array: ");
		int position=teclado.nextInt();
		
		mostrarPalabra(words,position);
	}
	static void mostrarPalabra(String[] palabras,int numero) {
		try {
			System.out.println(palabras[numero]);
			
		}catch(Exception e) {
			System.out.println("No existe la posicion "+numero+" en el array");
		}
			
	
			
	
		
		
		
	
	}

}
