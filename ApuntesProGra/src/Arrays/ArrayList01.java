package Arrays;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = numerosPositivos();
		System.out.println("\nNumeros positivos introducidos por orden de introduccion");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.print(numeros.get(i) + " ");
		}
		
	}
	
	public static ArrayList<Integer> numerosPositivos() {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> positivos = new ArrayList<Integer>();
		int numero;
		do {
			System.out.print("Introduce un entero positivo o 0 para salir: ");
			numero = teclado.nextInt();
			if(numero > 0) {
				positivos.add(numero);
			}
		} while(numero != 0);
		teclado.close();
		
		
		return positivos;
	}
}
