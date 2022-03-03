package SupuestoPractico6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Introduce un email: ");
		String text = keyboard.nextLine();
		System.out.print("Introduce un password: ");
		String text2 = keyboard.nextLine();
		System.out.print("Introduce una fecha en formato dd/mm/aaaa: ");
		String text3=keyboard.nextLine();
		
		/*----------Email-------*/
		if (Utilidades.validarEmail(text)) {
			System.out.println("El email '" + text + "' es valido");
		} else {
			System.err.println("El email '"+text+"' no es valido");
		}
		
		/*----------Password-------*/
		
		if (Utilidades.validarPassword(text2)) {
			System.out.println("El password '" + text2 + "' es valido");
		} else {
			System.err.println("El password '"+text2+"' debe teneral menos 8 caracteres, unamayuscula,un numero y un carcater especial");
		}
		/*----------Fecha-------*/
		if(Utilidades.validarFecha(text3)) {
			System.out.println("La fecha es valida "+text3);
		}else {
			System.out.println("La fecha no es valida "+text3);
		}
		
	}

}
