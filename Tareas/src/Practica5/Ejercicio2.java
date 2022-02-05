package Practica5;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(parentesisCorrectos(")((a + b) / 5-d)"));

	}

	static boolean parentesisCorrectos(String cadenaMate) {

		int contador = 0;

		for (int i = 0; i < cadenaMate.length(); i++) {
			if (cadenaMate.charAt(i) == '(') { // cuando se abre un parentesis cont++;
				contador++;
				return true;
			} else if (cadenaMate.charAt(i) == ')') {// cuando se cierra un parentesis cont--;
				contador--;
				return false;
			}
		}

		return contador == 0; // contador debe valer 0

	}

}
