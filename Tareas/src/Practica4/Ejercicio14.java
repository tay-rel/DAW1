package Practica4;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entry = new Scanner(System.in);
		System.out.print("Introduce texto: ");
		int result[]= indiceAlfabetico(entry.nextLine());

		System.out.println(Arrays.toString(result));

	}

	static int[] indiceAlfabetico(String word) { // texto con espacios
		// guarda word
		String formateado = word.toLowerCase().replace("\s", "");// texto minus. y sin espacios

		char letter[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		// comprueba coincidencia

		int position[] = new int[formateado.length()]; // obtiene el tamaño real

		for (int i = 0; i < formateado.length(); i++) {
			for (int j = 0; j < letter.length; j++) {
				if (formateado.charAt(i) == letter[j]) { // obtiene el caracter de un String (word) dependiendo del
															// indice (i)
					position[i] = j + 1; // guarda si encuentra

				}
			}
		}

		return position;

	}
}
