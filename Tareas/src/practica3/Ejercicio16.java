package practica3;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String palabras = " ";

		System.out.print("Escribe un texto: ");
		palabras = entrada.nextLine();

		String[] escribe = palabras.split(" ");
		
		String devuelve=palabrasCuatroLetras(escribe);
		
		System.out.println(devuelve);
		entrada.close();
	}

	static String palabrasCuatroLetras(String[] texto) {
		String dibujo="";
		
		for (int i = 0; i < texto.length; i++) {

			if (texto[i].length() >= 4) {
				//System.out.println(texto[i]);/*agregar contador de tipo string*/ 
				dibujo +=texto[i] + "\n";
			}
		
		}
		
		return dibujo;
	}

}
