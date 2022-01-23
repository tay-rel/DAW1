package Teoria2;
import java.util.Scanner;

public class String05b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner entrada=new Scanner(System.in);
		 
		  System.out.println("¿cuantas palabras quieres introducir?");
		  int cantidad=entrada.nextInt();
		  
		  String[] palabras1=pedirPalabras(cantidad);
		  mostrarPalabras(palabras1);
		
				
		
	}
	static String[] pedirPalabras(int cantidad) {
	Scanner entrada =new Scanner(System.in);
	String[] palabras=new String[cantidad];
	
	for(int i=0; i<palabras.length;i++) {
		
		System.out.println((i+1)+"º palabra: ");
		palabras[i]=entrada.nextLine();
		
		}
		entrada.close();
		return palabras;	
		
		
	}
	static void mostrarPalabras(String[] palabras) {
		
		for(int i=0; i<palabras.length;i++) {//el metodo length
			System.out.println(palabras[i]);
		} 
		

	}

}
