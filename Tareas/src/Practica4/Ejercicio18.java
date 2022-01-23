package Practica4;
import java.util.Arrays;

public class Ejercicio18 {

	public static void main(String[] args) {
	
		int[] array= { 5, 8, 13, 4, 9, 5, 3, 10, 15, 11, 14, 17, 12 };
		int numero = 3;
		System.out.println(" Array desordenado");
		System.out.println(Arrays.toString(array));
		
		int result = buscarBinariaRec(array, numero);
				
		if(result != Integer.MIN_VALUE) {
			Arrays.sort(array);
			System.out.println(" Array ordenado");
			System.out.println(Arrays.toString(array));
			System.out.println("\n\nEl indice del numero " + numero + " es: " + result);
		}
		else {
			System.out.println("El numero introducido no existe en la matriz actual.");
		}
		
		
	}
	public static int buscarBinariaRec(int[] numero, int valor) {
		Arrays.sort(numero); //ordena vectores
		
		int inf = numero.length / 2;
		int sup = numero.length - inf;
		
		return searchRec(numero, inf, sup, valor);
	}
	
	private static int searchRec(int[] numbers, int inf, int sup, int value) {
		
		int mid = (inf + sup) / 2;
		
		try {
			if(inf > sup) {
				if(value == numbers[mid]) {
					return mid;
				}
				else {
					if(value > numbers[mid]) {
						return searchRec(numbers, inf, mid - 1, value);
					}
					else {
						return searchRec(numbers, sup, mid + 1, value);
					}
				}
			}
			else {
				if(value == numbers[mid]) {
					return mid;
				}
				else {
					if(value < numbers[mid]) {
						return searchRec(numbers, inf, mid - 1, value);
					}
					else {
						return searchRec(numbers, sup, mid + 1, value);
					}
				}
			}
		}
		catch(java.lang.StackOverflowError e) {
			return Integer.MIN_VALUE;
		}
	
	
	}

}
