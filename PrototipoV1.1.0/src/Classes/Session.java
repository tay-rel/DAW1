package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Classes.User;

public class Session { // controla los aspectos de control de usuario

	// Clase objeto
	private User user = new User();
	// propiedades
	// private porque se modificaran dentro de la clase
	private boolean logged;

	// constructor
	public Session() {
		logged = false;
		// false Muestra menu de unLoggedMenu
		// true Muestra menu de LoggeMenu

	}

	// creamos getters-Devuelve el valor del estado de Session
	public boolean islogged() {
		return logged;

	}

	// devuelve al usuario actual
	public User getUser() {
		return user;

	}

	public void singUp() {
		System.out.println("\nREGISTRO\n");
		//String username = Interface.getString("\nNombre de usuario: "); // paso 1
		boolean pr=false;

			String data[] = new String[7];
			data[0] = Interface.getString("\nNombre de usuario: " );
			data[1] = Interface.getString("Password: ");
			data[2] = Interface.getString("Nombre Completo: ");
			data[3] = Interface.getString("NIF: ");
			data[4] = Interface.getString("Email: ");
			data[5] = Interface.getString("Direccion: ");
			data[6] = Interface.getString("Fecha de nacmiento: ");
			data[7] = "user";
			
		
		Utils.validateUsername(data[0]);
		Utils.validatePassword(data[1]);
		Utils.validateName(data[2]);
		Utils.validateDni(data[3]);
		Utils.validateEmail(data[4]);
		Utils.validateFecha(data[5]);
	
		
		
		
			//pr= true;
			
			
		/*if (username.length() > 0 ) {
			
			
		} else if (chekUser(username)) {
			System.out.println("\nEl usuario ya exixte");
			pr= false;
		}*/


	}

	public static boolean chekUser(String username) {
		boolean found = false;

		if (username.length() > 0) {
			found = true;
		}

		return found;

	}

	// metodo que se encarga de hacer Login
	public  void login() {

		String username = Interface.getString("\nIntroduce usuario: "); // paso1
		String password = Interface.getString("Introduce password: "); // paso2

		boolean log = false;

		if (username.length() > 0 && password.length() > 0) {
			User date = new DATABASE().login(username, Utils.getMD5(password));
			log = true;
		}

	}

	public void showUser() {
		// llamo a la variable de User user
		System.out.println("\n Usuario actual\n----------------");
		System.out.println("ID: " + user.id );
		System.out.println("Usuario : " + user.username );
		System.out.println("Nombre: " + user.name);
		System.out.println("NIF/NIE: " + user.nif);
		System.out.println("Email:" + user.email);
		System.out.println("Direccion: " + user.address);
		System.out.println("Fecha de nacimiento: " + user.birthdate + Utils.getAge(user.birthdate));
		System.out.println("Role" + user.role);
		// Para pulsar una tecla
		Interface.toContinue();

	}

	/*
	 * public String signup() { String message
	 * ="No se ha podido completar el registro"; String data[]=new String[8];
	 * data[7]="User";
	 * 
	 * data[0]=Interface.getString();
	 * 
	 * }
	 */

	// cerrar session
	public void logout() {
		logged = false;
		user = new User(); // limpiamos la classe User

	}
}
