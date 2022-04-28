package Classes;

/*implementar la funcionalidad de las opciones 1, 2 y 3*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
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
	private final int left = 1;
	private final int up = 2;
	private final int right = 3;
	private final int down = 4;
	private boolean search;

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
		Log.addLines("El archivo se ha cargado correctamente", filename);

	}// muestra mapa

	public void showMap() {

		try {
			System.out.print("Laberinto actual: " + filename + "\n");

			System.out.print("   ");
			// recorre espacios linea de arriba
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

			/*------------Pinta el camino ----------*/
			if (search) {
				if (map[startI][startJ] == 'E') {
					for (int i = 0; i < path.size(); i++) {
						if (path.get(i).direction == left) {
							map[path.get(i).i][path.get(i).j] = '<';
						} else if (path.get(i).direction == up) {
							map[path.get(i).i][path.get(i).j] = '^';
						} else if (path.get(i).direction == right) {
							map[path.get(i).i][path.get(i).j] = '>';
						} else if (path.get(i).direction == down) {
							map[path.get(i).i][path.get(i).j] = 'v';
						}
					}
				}

				map[startI][startJ] = 'E';
			}

			/*-----------------------------------*/

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
				Log.addLines("Se ha mostrado el laberinto ", filename);
			}

		} catch (Exception e) {
			System.out.println("\nVuelva a intentarlo,porfavor");
			Log.addLines("Error mostrar laberinto ", "(motivo: no se ha cargado laberinto)");
		}

	}

	public void setEntraceExit() {

		if (loaded == false) { // error y fin,porque no se ha cargado el laberinto
			System.err.println("\nLo siento no hay ningun laberinto cargado");
			return;
		}
		// reinicia las posiciones de las csasillas cuando se vueleve a inicializar
		if (startI != 0) {
			map[startI][startJ] = ' ';
			map[endI][endJ] = ' ';

		}

		System.out.println("\nIntroduce la coordenadas");
		startI = Interface.getInt("Fila [E]: ");
		startJ = Interface.getInt("Columna [E]: ");
		endI = Interface.getInt("Fila [S]: ");
		endJ = Interface.getInt("Columna [S]: ");
		// path = new ArrayList<Coordinate>();// Limpio Path
		try {

			// entrada
			if (map[startI][startJ] != ' ') {
				System.err.println("\n¡Opps! Te has encontrado con una pared");
				return;
			} // salida
			if (map[endI][endJ] != ' ') {
				System.err.println("\n¡Opps! Te has encontrado con una pared");
				return;
			}
			// Limpio Path
			for (Coordinate cs : path) {
				map[cs.i][cs.j] = ' ';
			}
			path = new ArrayList<Coordinate>();// Limpio Path

			map[startI][startJ] = 'E';
			map[endI][endJ] = 'S';
			setIO = true;// guardo la carga de E/S

			System.out.println("\n\tLos puntos se ha cargado correctamente\n \t\t¡Bien hecho!");
			Log.addLines("Las casillas se han establecido correctamente ",
					"(" + startI + ", " + startJ + ") (" + endI + ", " + endJ + ")");

			return;
		} catch (Exception e) {
			System.err.println("Lo siento, los valores estan fuera de rango");
			Log.addLines("Las casillas no se han establecido correctamente ",
					"(" + startI + ", " + startJ + ") (" + endI + ", " + endJ + ")");
			startI = 0;
			startJ = 0;
			endI = 0;
			endJ = 0; // valores que se han metido fuera de rango
			return;
		}

	}

	/*----------------- Muestra Menu de Algoritmo -----------------*/
	public void selectAlgoritm() {
		if (loaded && setIO) { // Si el laberinto ya ha sido cargado y si ya se ha metido las coordenadas
			int option = Interface.getInt(Config.algorithMenu);

			switch (option) {
			case 1:
				if (findPath(true)) {
					System.out.println("\n\tCamino encontrado");
					Log.addLines("Exito "," "+ path.size());
					search = true;
					showMap();
					step();

				} else {
					System.err.println("\n\tCamino no entontrado");
					Log.addLines("Sin solución "," "+ path.size());
				}
				break;
			case 2:
				if (secondPath(false)) {
					System.out.println("\n\tCamino encontrado");
					Log.addLines("Exito "," "+ path.size());
					search = true;
					showMap();
					step();

				} else {
					System.err.println("\n\tCamino no entontrado");
					Log.addLines("Sin solución "," "+ path.size());
				}
				break;
			default:
				break;
			}

		} else {
			System.err.println("Lo siento laberinto no esta cargado");
			Log.addLines("Error acceder a la selección buscar caminos ",
					"motivo: no se ha cargado laberinto o no hay casillas");

		}
		// Se acaba el if

	}

	public void step() {
		System.out.println("\nPasos: " + path.size());
		System.out.println();
		String direction = " ";
		for (Coordinate i : path) {
			if (i.direction == left) {
				direction = "Izquierda";
			} else if (i.direction == up) {
				direction = "Arriba";
			} else if (i.direction == right) {
				direction = "Derecha";
			} else if (i.direction == down) {
				direction = "Abajo";
			} else if (i.direction == 0) {
				direction = "Final";
			}
			System.out.println("(" + i.i + ", " + i.j + ") - " + direction);
		}

	}

	/*----------------- Implementacion Algoritmo de @David-----------------*/
	private boolean findPath(boolean a) {
		path = new ArrayList<Coordinate>();
		Coordinate startCell = new Coordinate();// Guarda la casilla inicial en el camino
		startCell.i = startI; // Valores asignados
		startCell.j = startJ;
		path.add(startCell); // accede alultimo elemento

		while (path.size() > 0) {
			path.get(path.size() - 1).direction += 1; // incremeta la direccion
			if (path.get(path.size() - 1).direction <= 4) {
				Coordinate nextCell = setNextCell(path.get(path.size() - 1));// Comprobacion de casillas
				if (checkCell(nextCell)) {
					path.add(nextCell); // borra la ultima posicion
				}
				if (nextCell.i == endI && nextCell.j == endJ) {// comprueba casiila de salida
					return true;
				}

			} else {
				path.remove(path.size() - 1); // borra la ultima posicion
			}

		}
		return true;
	}

	private Coordinate setNextCell(Coordinate currentCoord) {
		Coordinate nextCoord = new Coordinate();
		nextCoord.i = currentCoord.i;
		nextCoord.j = currentCoord.j;
		// Comprobamos direction recibiendo la coordenada actual
		if (currentCoord.direction == left) {// izquierda
			nextCoord.j--;
		} else if (currentCoord.direction == up) {// arriba
			nextCoord.i--;
		} else if (currentCoord.direction == right) {// derecha
			nextCoord.j++;
		} else if (currentCoord.direction == down) {// abajo
			nextCoord.i++;
		}

		return nextCoord;
	}

	private boolean checkCell(Coordinate cell) {
		if (map[cell.i][cell.j] == '#') {// pared
			return false;
		}
		for (int i = 0; i < path.size(); i++) {// comprueba si ya ha estado
			if (path.get(i).i == cell.i && path.get(i).j == cell.j) {
				return false;
			} else {

			}
		}

		return true;
	}

	/*----------------- Implementacion Algoritmo de @David -Segundo camino-----------------*/

	public ArrayList<Coordinate> copyArray(ArrayList<Coordinate> copy) {
		ArrayList<Coordinate> copyOf = new ArrayList<Coordinate>();
		for (int i = 0; i < copy.size(); i++) {
			Coordinate coor = new Coordinate();
			coor.i = copy.get(i).i;
			coor.j = copy.get(i).j;
			coor.direction = copy.get(i).direction;
			copyOf.add(coor);
		}
		return copyOf;

	}

	private boolean secondPath(boolean b) {
		path = new ArrayList<Coordinate>();
		ArrayList<Coordinate> aux = new ArrayList<Coordinate>();
		boolean find = false;
		Coordinate startCell = new Coordinate();// Guarda la casilla inicial en el camino
		startCell.i = startI; // Valores asignados
		startCell.j = startJ;
		path.add(startCell); // accede alultimo elemento

		while (path.size() > 0) {
			path.get(path.size() - 1).direction += 1; // incremeta la direccion
			if (path.get(path.size() - 1).direction <= 4) {
				Coordinate nextCell = setNextCell(path.get(path.size() - 1));// Comprobacion de casillas
				if (checkCell(nextCell)) {
					path.add(nextCell); // borra la ultima posicion
				}
				if (nextCell.i == endI && nextCell.j == endJ) {// comprueba casiila de salida
					find = true;
					if (aux.size() == 0) {
						aux = copyArray(path);
					}

					if (aux.size() > path.size()) {
						aux = copyArray(path);
					}
				}

			} else {
				path.remove(path.size() - 1); // borra la ultima posicion
			}

		}

		path = copyArray(aux);
		return find;
	}

}
