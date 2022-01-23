package Teoria2;
import java.util.Scanner;

public class String06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		String texto=" ";
		
		System.out.print("Escribe un texto: ");
		texto=entrada.nextLine();
		
		String[] escribe=texto.split(" ");//corta por los espacios y los va metiendo en un array expresion irregular("-,_ ?.@\t\n]+")

		
		mostrarPalabras(escribe);
		
		entrada.close();
	}
	
	static void mostrarPalabras(String[] texto) {
	
		for(int i=0; i<texto.length;i++) {//el metodo length
			
			if(texto[i].length()>0) {
				
				System.out.println(texto[i]);
			}
		} 	

	}

}
