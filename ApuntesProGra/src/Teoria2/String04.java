package Teoria2;
import java.util.Scanner;

public class String04 {
//dar un salto de linea en cada palabra
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		
		System.out.print("Escribe un texto: ");
		String escribe=entrada.nextLine();
		mostrarPalabras(escribe);
		
		entrada.close();
	}
	
	static void mostrarPalabras(String texto) {
		String cadena="";
		
		for(int i=0; i<texto.length();i++) {//el metodo length
			if(texto.charAt(i)!=' ') {
				cadena += texto.charAt(i);
				
			}else {
				cadena +='\n';
			}
		} 
		
		System.out.println(cadena);
		

	}

}
