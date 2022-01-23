import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = " ";
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca un texto, porfavor: ");
		texto=entrada.nextLine();
		System.out.println("\nEl texto original es: "+ texto);
		System.out.println("\nEl texto actual es: "+invertirTexto(texto));

	}

	static String invertirTexto(String cadena) {
		String texto="";
		
		for(int i=cadena.length()-1;i>0;i--) {
			texto+=cadena.charAt(i);
		}
		
		return texto;
	}
}

		//segunda forma
	
		
		/*static String invertirTexto2(String cadena) {
			StringBuilder texto=new StringBuilder(cadena);
			return texto.reverse().toString();*/
	
	
	
	


