package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;

import Classes.User;

public class Session { // controla los aspectos de control de usuario

	// Propiedades
	private static User user = new User();
	private static boolean logged;

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
	public static User getUser() {
		return user;

	}

	public static Labyrinth labyrinth = new Labyrinth();

	public static void singUp() {
		System.out.println("\nREGISTRO\n");
		// String username = Interface.getString("\nNombre de usuario: "); // paso 1
		// boolean pr = false;

		String data[] = new String[7];
		data[0] = Interface.getString("\nNombre de usuario: ");

		if (Utils.validateUsername(data[0]) == false) {
			System.err.println("El formato de la username no es correcto");
			Log.addLines("El registro no se ha realizado correctamente", data[0]);

			return;
		}
		if (DATABASE.chekData("username", data[0]) == true) {
			System.err.println("El usuario ya existe");
			Log.addLines("El registro no se ha realizado correctamente", data[0]);

			return;
		}

		data[1] = Interface.getString("Password: ");
		if (Utils.validatePassword(data[1]) == false) {
			System.err.println("Las contraseñas deben contener" + " por lo menos un número y un carácter especial, "
					+ "incluir letras en mayúscula y minúscula, " + "tener una longitud mínima de 8 caracteres y "
					+ "no contener su correo electrónico o coincidir con él.");
			Log.addLines("El registro no se ha realizado correctamente", data[1]);

			return;
		}
		data[2] = Interface.getString("Nombre Completo: ");
		if (Utils.validateName(data[2]) == false) {
			System.err.println("El formato de la nombre no es correcto");
			Log.addLines("El registro no se ha realizado correctamente", data[2]);

			return;
		}
		data[3] = Interface.getString("NIF: ");

		if (Utils.validateDni(data[3]) == false) {
			System.err.println("El formato del DNI no es correcto");
			Log.addLines("El registro no se ha realizado correctamente", data[3]);

			return;
		}
		if (DATABASE.chekData("nif", data[3]) == true) {
			System.err.println("El NIF ya existe");
			Log.addLines("El registro no se ha realizado correctamente", data[3]);

			return;
		}
		data[4] = Interface.getString("Email: ");

		if (Utils.validateEmail(data[4]) == false) {
			System.err.println("El formato del email no es correcto");
			Log.addLines("El registro no se ha realizado correctamente", data[4]);

			return;
		}
		if (DATABASE.chekData("email", data[4]) == true) {
			System.err.println("El email ya existe");
			Log.addLines("El registro no se ha realizado correctamente", data[4]);

			return;
		}
		data[5] = Interface.getString("Direccion: ");

		data[6] = Interface.getString("Fecha de nacimiento: ");
		if (Utils.validateDate(data[6]) == false) {
			System.err.println("El formato de la Fecha no es correcto");
			Log.addLines("El registro no se ha realizado correctamente", data[6]);

			return;
		}

		if (DATABASE.singUp(data[0], data[1], data[2], data[3], data[4], data[5], data[6])) {
			System.out.println("\tEl usuario ha sido creado correctamente");
			Log.addLines("Registro exitoso ", data[0]);
		}

	}

	// metodo que se encarga de hacer Login
	public void login() {

		String username = Interface.getString("\nIntroduce usuario: "); // paso1
		String password = Interface.getString("Introduce password: "); // paso2

		// System.out.println(username +" "+password);

		user = DATABASE.login(username, Utils.getMD5(password));

		if (user != null) {
			logged = true;
			System.out.println("\n\tIniciando sesion...");
			Log.addLines("El inicio se ha realizado correctamente", username);
		}

		if (!logged) {
			System.err.println("\nEl usuario y/o password incorrecto");
			Log.addLines("El inicio no se ha realizado correctamente", username);
		}

	}

	public void showUser() { // llamo a la variable de User user

		System.out.println("\n Usuario actual\n----------------");
		System.out.println("ID: " + user.id);
		System.out.println("Usuario : " + user.username);
		System.out.println("Nombre: " + user.name);
		System.out.println("NIF/NIE: " + user.nif);
		System.out.println("Email:" + user.email);
		System.out.println("Direccion: " + user.address);
		System.out.println("Fecha de nacimiento: " + Utils.formatDateEU(user.birthdate) + " Tu edad: "
				+ Utils.getAge(Utils.formatDateEU(user.birthdate)));
		System.out.println("Role: " + user.role);
		Log.addLines("Mostrar el usuario actual", user.id + " - " + user.username);

		// Para pulsar una tecla
		Interface.toContinue();

	}

	// cerrar session
	public static void logout() {
		logged = false;
		user = new User(); // limpiamos la classe User
		Log.addLines("Cerrando sesion ", user.username);

	}
}
