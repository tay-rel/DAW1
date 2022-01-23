package ATS_ejercicios;import java.util.Scanner;

public class Ejericio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		String texto = teclado.nextLine();

		String codigo = contarCaracteresPalabrasLineas(texto);
		System.out.println(codigo);
		System.out.println(
				"OPCIONES\n-------- \n1- Cantidad de caracteres \n2- Cantidad de palabras \n3- Cantidad de líneas");
		System.out.print("\nSelecciona una opción: ");
		int opcion = teclado.nextInt();
		if (opcion < 1 || opcion > 3) {
			System.err.println("Opción no válida");
			return;
		}
		String resultado = interpretarCodigo(codigo, opcion);
		System.out.println("\nRESULTADO: " + resultado);
		teclado.close();

	}

	static String contarCaracteresPalabrasLineas(String texto) {
		int num_caracteres = 0, num_palabras = 0, num_lineas = 1;
		String[] palabras = texto.split("[ \n\t]");

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].length() > 0) {
				num_palabras++;
				num_caracteres += palabras[i].length();
			}
		}

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == '\n') {
				num_lineas++;
			}
			}
		return texto;
		}
		

	static String interpretarCodigo(String codigo, int opcion) {
		String [] valores = codigo.split("-");
		String [] tipos = {"caracteres", "palabras", "lineas"};
		return valores [opcion -1] + " " + tipos[opcion -1];
		
		
	}

}
