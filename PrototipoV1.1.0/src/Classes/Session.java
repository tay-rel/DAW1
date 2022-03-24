package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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

	/*
	 * private boolean chekUser(String username) { boolean found = false;
	 * ArrayList<String> users = readUsersFile();
	 * 
	 * for (int i = 0; i < users.size(); i++) { String[] currentUser =
	 * users.get(i).split("#"); if (username.equalsIgnoreCase(currentUser[0])) {
	 * found = true; break; } }
	 * 
	 * return found;
	 * 
	 * }
	 */

	// metodo que se encarga de hacer Login
	public void login() {
		
		String username = Interface.getString("\nIntroduce usuario: "); // paso1
		String password = Interface.getString("Introduce password: "); // paso2
		
		boolean log=false;
		
		if(username.length()> 0 && password.length()>0) {
			User date=new DATABASE().login(username,Utils.getMD5(password));
			log=true;
		}
		
		
 	}


	public void showUser() {
		// llamo a la variable de User user
		System.out.println("\n Usuario actual\n----------------");

		System.out.println("Usuario : " + user.username);
		System.out.println("Nombre: " + user.name);
		System.out.println("NIF/NIE: " + user.nif);
		System.out.println("Email:" + user.email);
		System.out.println("Direccion: " + user.address);
		System.out.println("Fecha de nacimiento: " + user.birthdate);
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
