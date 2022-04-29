
/**
 * Main.java
 * Programa principal del sistema para resolver un laberinto
 * AAMS - 2021.11.29
 * version 0.1.0
 */
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Classes.Config;
import Classes.Interface;
import Classes.Session;
import Classes.Labyrinth;
import Classes.Log;

/* @A.A.M.S - DAW1
 * 
 * 
 */
public class Main {
	// Creamos objeto
	public static Session session = new Session();
	public static Labyrinth labyrinth = new Labyrinth();
	public static Log logEvent = new Log();

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.println("Version actual: " + Config.version);
		System.out.println();

		logEvent.addLines("Inicio de programa", "........");

		System.out.println(Config.welcome);
		// comprueba si esta loggeado
		int option = -1;// 1

		while (option != 0) {
			if (!session.islogged()) {// comprueba si la sesion esta iniciada
				option = Interface.getInt(Config.unLoggedMenu);
				unloggedAction(option);

			} else if (session.islogged()) {// cuando la sesion este iniciada
				option = Interface.getInt(Config.LoggedMenu);
				loggedAction(option);
			}

		}

		System.out.println(Config.goodbye);
		Log.addLines("Finalizar Programa");

	}

	private static void unloggedAction(int option) throws InterruptedException {

		switch (option) {
		case 1:
			session.login();
			Thread.sleep(Config.miliseconds);
			break;
		case 2:
			session.singUp();
			Thread.sleep(Config.miliseconds);
			break;
		}

	}

	private static void loggedAction(int option) throws InterruptedException, IOException {

		// int miliseconds=2000;
		switch (option) {
		case 1:

			labyrinth.loadLabyrinth();
			Thread.sleep(Config.miliseconds);
			break;
		case 2:
			labyrinth.showMap();
			Thread.sleep(Config.miliseconds);
			Interface.toContinue();
			break;
		case 3:
			labyrinth.showMap();
			labyrinth.setEntraceExit();
			Thread.sleep(Config.miliseconds);
			break;
		case 4:
			labyrinth.selectAlgoritm();
			Log.addLines("Acceder a la selección buscar caminos ");
			Thread.sleep(Config.miliseconds);

			break;
		case 5:
			// muestra al usuario cuando tiene la session iniciada
			session.showUser();
			break;
		case 6:
			session.role();
			session.modification();
			break;
		case 7:
			System.out.println("\nCerrando sesion");
			labyrinth = new Labyrinth();
			// session = new Session(); //instanciamos de nuevo
			session.logout(); // Para limpiarlo
			// tiempo de espera
			Thread.sleep(Config.miliseconds);
			break;

		}

	}
}