package Teoria2;
import java.util.Scanner;

public class UA_Int04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de números a ordenar: ");
		int cantidad = teclado.nextInt();
		int[] numeros = pedirNumeros(cantidad);
		System.out.print("Números sin ordenar: ");
		mostrarArray(numeros);
		System.out.print("Números ordenados: ");
		mostrarArray(numerosOrdenados(numeros));
		teclado.close();
	}
	
	static int[] pedirNumeros(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[cantidad]; // Crea un array vacío
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Introduce " + (i+1) + "º número: ");
			numeros[i] = teclado.nextInt();
		}
		teclado.close();
		return numeros;
	}
	
	static void mostrarArray(int[] numeros) {
		String serie = "";
		for (int i = 0; i < numeros.length; i++) {
			serie += numeros[i];
			if (i < numeros.length - 1) {serie += ",";}
		}
		System.out.println(serie);
	}
	
	static int[] numerosOrdenados(int[] numeros) {
		int aux;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i; j < numeros.length; j++) {
				if (numeros[j] < numeros[i]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;	
				}
			}
		}
		return numeros;
	}
		
		
	

}
