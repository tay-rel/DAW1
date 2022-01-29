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

	public void writeUsersFile(String datos) {
		try {
			FileWriter myWriter = new FileWriter(Config.filePath + Config.usersFile, true); // es un atributo de
																							// filewriter para no
																							// sobreescribir
			myWriter.write("\n" + datos);
			myWriter.close();
			System.out.println("\nCreando usuario...\n");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	public void singUp() {
		System.out.println("\nREGISTRO\n");
		user.username = Interface.getString("\nNombre de usuario: "); // paso 1

		if (chekUser(user.username)) {
			System.out.println("\nEl usuario ya exixte");
			return;
		}

		ArrayList<String> users = readUsersFile();

		for (int i = 0; i < users.size(); i++) {

			String[] currentUser = users.get(i).split("#");

			// System.out.println(user.userName(currentUser[0]));

			if (!user.username.equals(currentUser[0])) {

				user.password = Interface.getString("Contraseña: ") + "#";
				user.name = Interface.getString("Nombre completo: ") + "#";
				user.age = Interface.getString("Edad: ") + "#";
				user.nif = Interface.getString("NIF: ") + "#";
				user.email = Interface.getString("Correo electrónico: ") + "#";
				user.address = Interface.getString("Dirección: ") + "#";
				user.birthdate = Interface.getString("Fecha de nacimiento: ") + "#";
				user.role = "user: ";

				writeUsersFile(user.username + "#" + user.password + user.name + user.age + user.nif + user.email
						+ user.address + user.birthdate + user.role);
				break;
			} else {
				System.out.println("\nEl usuario ya existe.");
				break;
			}
		}
	}

	private boolean chekUser(String username) {
		boolean found = false;
		ArrayList<String> users = readUsersFile();

		for (int i = 0; i < users.size(); i++) {
			String[] currentUser = users.get(i).split("#");
			if (username.equalsIgnoreCase(currentUser[0])) {
				found = true;
				break;
			}
		}

		return found;

	}

	// metodo que se encarga de hacer Login
	public void login() {
		String username = Interface.getString("\nIntroduce usuario: "); // paso1
		String password = Interface.getString("Introduce password: "); // paso2

		ArrayList<String> users = readUsersFile(); // paso3

		for (int i = 0; i < users.size(); i++) { // paso4
			String[] currentUser = users.get(i).split("#");

			if (username.equalsIgnoreCase(currentUser[0]) && password.equals(currentUser[1])) {
				logged = true;
				setUser(currentUser); // Array que se convirtio
				System.out.println("\nSesion iniciada correctamente\n");
				break; // Deja de comprobar cuando lo encuentra
			}
		}

		if (!logged) {
			System.err.println("\nEl usuario y/o password incorrecto");
		}

	}

	private void setUser(String[] currentUser) {

		this.user.username = currentUser[0];
		this.user.name = currentUser[2];
		this.user.age = currentUser[3];
		this.user.nif = currentUser[4];
		this.user.email = currentUser[5];
		this.user.address = currentUser[6];
		this.user.birthdate = currentUser[7];
		this.user.role = currentUser[8];

	}

	// devuelve un Arrays list con todos los usuarios
	private ArrayList<String> readUsersFile() {
		ArrayList<String> lines = new ArrayList<String>();

		try {
			File myObj = new File(Config.filePath + Config.usersFile);
			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				/* System.out.println(data); */
				lines.add(line);
			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return lines;
	}

	public void showUser() {
		// llamo a la variable de User user
		System.out.println("\n Usuario actual\n----------------");

		System.out.println("Usuario : " + user.username);
		System.out.println("Nombre: " + user.name);
		System.out.println("Edad: " + user.age);
		System.out.println("NIF/NIE: " + user.nif);
		System.out.println("Email:" + user.email);
		System.out.println("Dirección: " + user.address);
		System.out.println("Fecha de nacimiento: " + user.birthdate);
		System.out.println("Role" + user.role);
		// Para pulsar una tecla
		Interface.toContinue();

	}

	// cerrar session
	public void logout() {
		logged = false;
		user = new User(); // limpiamos la classe User

	}
}
