package Ejercicio06;

import java.util.Arrays;
import java.util.Stack;

public class Ejercicio06 {
	public static void main(String[] args) {
		
		Stack<String> pila = new Stack<String>();
		pila.push("1. Camelia");
		pila.push("2. Azalea");
		pila.push("3. Jazmín");
		pila.push("4. Datura");

		// Convierte el Stack en array.
		Object[] plantas = pila.toArray();

		// Muestra la pila de nombres de plantas.
		System.out.println("Cima de la pila: " + pila.peek());
		while (pila.size() > 0) {
			String nombrePlanta = pila.pop();
			System.out.println(nombrePlanta);
		}
		
		
		pila.push("Primero ");
		pila.push("Segundo");
		pila.push("Tercero");
		System.out.println("Cima de la pila: " + pila.peek());
		System.out.println(Arrays.toString(pila.toArray()));
		// Muestra el array de nombres de plantas. La pila ya está vacía.
		System.out.println("Array:\n" + Arrays.toString(plantas));
	}
}
