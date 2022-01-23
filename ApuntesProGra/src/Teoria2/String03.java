
package Teoria2;import java.util.Scanner;
//Escribe el texto
public class String03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		String escribe=" ";
		
		System.out.print("Escribe un texto: ");
		escribe=entrada.nextLine();
		
		System.out.print("Cantidad: "+escribe.length());
		System.out.println();
		mostrarTexto(escribe);
		
		entrada.close();
		
	}
	static void mostrarTexto(String escribe) {
		
		
		for(int i=0; i<escribe.length();i++) {
			
			System.out.print(escribe.charAt(i));
		} 
		

	}

}
