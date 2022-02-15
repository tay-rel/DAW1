package Class;

import java.util.Scanner;

public class Interface2 {
	// tiene metodos,para interactuar por teclado
	public static Scanner keyboard = new Scanner(System.in); // podemos utilizarla sin tener que utilizarla como object

	public static void main(String[] args) {

	}

	// Con enunciado
	public static int getInt(String text) {
		int number = -1;
		System.out.print(text);
		String value = keyboard.nextLine();
		try {
			number = Integer.parseInt(value);
		} catch (Exception e) {
			// keyboard.next();
			System.out.println("\nEl valor introducido no es un numero");
		}
		return number;

	}

	// Metodo para que pida una accion para continuar
	public static void toContinue() {
		System.out.print("\nPulse cualquier tecla + enter para continuar ");
		if (keyboard.next() == keyboard.nextLine()) {
			keyboard.close();
		}
	}
}
