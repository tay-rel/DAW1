package Classes;

import java.util.Scanner;

public class Interface {
	// tiene metodos,para interactuar por teclado
		public static Scanner keyboard = new Scanner(System.in); // podemos utilizarla sin tener que utilizarla como object

		public static void main(String[] args) {

		}

		// Sin enunciado
		public static int getInt() {
			int number = -1;
			String value = keyboard.nextLine();
			try {
				number = Integer.parseInt(value);// cualquier texto convertirlo a entero
			} catch (Exception e) {
				System.out.println("\nEl valor introducido no es un numero");
				// keyboard.next();
			}
			return number;
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

		// Sin enunciado
		public static String getString() {
			String value = keyboard.nextLine().trim();
			return value;
		}

		// Con enunciado
		public static String getString(String text) {
			System.out.print(text);
			String value = keyboard.nextLine().trim();
			return value;
		}

		// Metodo para que pida una accion para continuar
		// Version 2
		public static void toContinue() {
			System.out.print("\nPulse 'enter' para continuar");
			try {
				System.in.read();
			} catch (Exception e) {
			}
			
	}
}