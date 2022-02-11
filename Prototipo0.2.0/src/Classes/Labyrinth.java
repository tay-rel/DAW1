package Classes;

/*implementar la funcionalidad de las opciones 1, 2 y 3*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Classes.Config;
import Classes.Interface;

public class Labyrinth {

	// propiedades
	private char[][] map;
	private String filename;
	private boolean loaded;
	private boolean setIO;
	private int startI, startJ, endI, endJ;
	private ArrayList<Coordinate> path = new ArrayList<Coordinate>(); // inicializo un ArrayList vacio

	// constructor
	public Labyrinth() {
		loaded = false;
	}

	private File listDirectory() throws IOException { // muestra las opciones a elegir de ficheros
		Scanner entry = new Scanner(System.in);

		File[] files = new File[0];

		try {

			files = new File(Config.labyrinthsPath).listFiles();// recorre lo que hay en file, siendo un array de
																// archivos
			System.out.println();

			for (int i = 0; i < files.length; i++) {
				System.out.println((i + 1) + ". " + files[i].getName());
			}

		} catch (Exception e) {

			System.err.println("\nNo se ha podido acceder al directorio de laberintos");

		}

		System.out.print("\nEliga una opcion: ");
		int option = entry.nextInt();

		return files[option - 1];

	}

	public void loadLabyrinth() throws IOException, InterruptedException {

		System.out.println("\nLaberintos disponibles\n---------------------");

		ArrayList<String> lines = new ArrayList<String>();

		try {
			File myObj = listDirectory();
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				lines.add(data);

			}

			map = new char[lines.size()][lines.get(0).length()];

			for (int i = 0; i < lines.size(); i++) {
				for (int j = 0; j < lines.get(0).length(); j++) {
					map[i][j] = lines.get(i).charAt(j); // guarda lo que hay linea [i]
				}
			}
			filename = myObj.getName(); // guarda el nombre

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		loaded = true;

	}// muestra mapa

	public void showMap() {

		try {

			// recorre espacios linea de arriba
			
			System.out.print("Laberinto actual: "+filename+"\n");
			for (int a = 0; a < map.length; a++) {
				if (a < 10) {
					System.out.print("  ");
				} else { // cuando es mayor a 9
					System.out.print(String.valueOf(a).charAt(0) + " ");
				}
			}

			// recorre numeros linea debajo

			System.out.print("\n   ");

			for (int m = 0; m < map.length; m++) {
				if (m < 10) {
					System.out.print(m + " ");
				} else {
					System.out.print(String.valueOf(m).charAt(1) + " ");

				}

			}

			System.out.println();

			// bucle recorre map
			for (int x = 0; x < map.length; x++) {
				if (x < 10) {
					System.out.print(" " + x + " ");
				} else {
					System.out.print(x + " ");
				}
				for (int y = 0; y < map.length; y++) {
					System.out.print(map[x][y] + " ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("\nVuelva a intentarlo,porfavor");
		}

	}

	public void setEntraceExit() {

		if (loaded == false) { // error y fin,porque no se ha cargado el laberinto
			System.err.println("\nLo siento no hay ningun laberinto cargado");
			return;
		}
		// reinicia las posiciones de las csasillas cuando se vueleve a inicializar
		if (startI != 0) {
			map[startI][endI] = ' ';
			map[startJ][endJ] = ' ';

		}
		// showMap(); // muestra el mapa
		System.out.println("\nIntroduce la coordenadas de [E]ntrada / [S]alida");
		startI = Interface.getInt("Columna [E]: ");
		endI = Interface.getInt("Fila [E]: ");
		startJ = Interface.getInt("Columna [S]: ");
		endJ = Interface.getInt("Fila [S]: ");

		try {
			// si son iguales
			if (startI == startJ && endI == endJ) {
				System.err.println("\nLo siento los valores no son validos");
				return;

			}
			// entrada
			if (map[startI][endI] != ' ') {
				System.err.println("\n¡Opps! Te has encontrado con una pared");
				return;
			} // salida
			if (map[startJ][endJ] != ' ') {
				System.err.println("\n¡Opps! Te has encontrado con una pared");
				return;
			}

			map[startI][endI] = 'E';
			map[startJ][endJ] = 'S';
			setIO = true;// guardo la carga de E/S

			System.out.println("\n\tLos puntos se ha cargado correctamente\n \t¡Bien hecho!");
			return;
		} catch (Exception e) {
			System.err.println("Lo siento, los valores estan fuera de rango");
			startI = 0;
			endI = 0;
			startJ = 0;
			endJ = 0; // valores que se han metido fuera de rango
			return;
		}

	}

	/*----------------- Muestra Menu de Algoritmo -----------------*/
	public void selectAlgoritm() {
		if (loaded && setIO) { // Si el laberinto ya ha sido cargado
			// Si ya se ha metido las coordenadas de E/S
			int option = Interface.getInt(Config.algorithMenu);

			switch (option) {
			case 1:
				System.out.println("En proceso"); // camino largo
				break;
			case 2:
				System.out.println("En proceso"); // camino corto
				break;
			default:
				break;
			}

		} // Se acaba el if

	}

}

