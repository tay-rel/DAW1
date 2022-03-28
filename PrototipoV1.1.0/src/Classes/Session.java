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
			;
			
			if (DATABASE.chekUser(data[0])==false) {
				System.out.println("El usuario ya existe");
				return;
			}
		
		if(Utils.validateUsername(data[0])==false) {
			System.err.println("El formato de la username no es correcto");
			return;
		}
		
		if(Utils.validatePassword(data[1]) == false) {
			System.err.println("El formato de la contraseña no es correcto");
			return;
		}
			//return;
		
		if(Utils.validateName(data[2])==false) {
			System.err.println("El formato de la nombre no es correcto");
			return;
		}
		if(Utils.validateDni(data[3])==false) {
			System.err.println("El formato del DNI no es correcto");
			return;
		}
		
		if(Utils.validateEmail(data[4])==false) {
			System.err.println("El formato del email no es correcto");
			return;
		}
		
		if(Utils.validateFecha(data[5])==false) {
			System.err.println("El formato de la Fecha no es correcto");
			return;
		}
		
	
		try {
			String date=DATABASE.singUp(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			//pr= true;
			
			
		/*if (username.length() > 0 ) {
			
			
		} else if (chekUser(username)) {
			System.out.println("\nEl usuario ya exixte");
			pr= false;
		}*/


	}

	

	// metodo que se encarga de hacer Login
	public  void login() {

		String username = Interface.getString("\nIntroduce usuario: "); // paso1
		String password = Interface.getString("Introduce password: "); // paso2

		
		if (username.length() > 0 && password.length() > 0) {
			
			user = DATABASE.login(username, Utils.getMD5(password));
			
			if (user != null) {
				this.logged =true;
			}
			
			
			System.out.println(user.username);
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
