package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import Class.Config2;
import Class.Coordinate2;
import Class.Interface2;

public class Labyrinth2 {

	// propiedades
	private char[][] map;
	private String filename;
	private boolean loaded;
	private boolean setIO; // Establecer entrada y salida
	private int startI, startJ, endI, endJ;
	private ArrayList<Coordinate2> path = new ArrayList<Coordinate2>(); // inicializo un ArrayList vacio
	private final int IZQUIERDA = 1;
	private final int ARRIBA = 2;
	private final int DERECHA = 3;
	private final int ABAJO = 4;
	
	private boolean search;

	// constructor
	public Labyrinth2() {
		loaded = false;
	}

	private File listDirectory() throws IOException { // muestra las opciones a elegir de ficheros
		Scanner entry = new Scanner(System.in);

		File[] files = new File[0];

		try {

			files = new File(Config2.labyrinthspath).listFiles();// recorre lo que hay en file, siendo un array de
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

			System.out.print("   ");
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

			// Pinta el camino
			if (search) {
				if (map[startI][startJ] == 'E') {
					map[startI][startJ] = 'E';
				for (int i = 0; i < path.size(); i++) {
					if (path.get(i).direction == IZQUIERDA) {
						map[path.get(i).i][path.get(i).j] = '<';
					} else if (path.get(i).direction == ARRIBA) {
						map[path.get(i).i][path.get(i).j] = '^';
					} else if (path.get(i).direction == DERECHA) {
						map[path.get(i).i][path.get(i).j] = '>';
					} else if (path.get(i).direction == ABAJO) {
						map[path.get(i).i][path.get(i).j] = 'v';
					}
				}
			}
			
				map[startI][startJ] = 'E';
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
			map[startI][startJ] = ' ';
			map[endI][endJ] = ' ';

		}
		// showMap(); // muestra el mapa
		System.out.println("\nIntroduce la coordenadas de [E]ntrada / [S]alida");
		startI = Interface2.getInt("Fila [E]: ");
		startJ = Interface2.getInt("Columna [E]: ");
		endI = Interface2.getInt("Fila [S]: ");
		endJ = Interface2.getInt("Columna [S]: ");

		try {
			// si son iguales
			
			 /* if (startI == startJ && endI == endJ) {
			  System.err.println("\nLo siento los valores no son validos"); return;
			  
			  }
			 */
			// entrada
			if (map[startI][startJ] != ' ') {
				System.err.println("\n¡Opps! Te has encontrado con una pared");
				return;
			} // salida
			if (map[endI][endJ] != ' ') {
				System.err.println("\n¡Opps! Te has encontrado con una pared");
				return;
			}

			map[startI][startJ] = 'E';
			map[endI][endJ] = 'S';
			path = new ArrayList<Coordinate2>();// para limpiarlo
			setIO = true;
			System.out.println("\nLos puntos se ha cargado correctamente\n ¡Bien hecho!");
			return;
		} catch (Exception e) {
			System.err.println("Lo siento, los valores estan fuera de rango");
			startI = 0;
			endI = 0;
			startJ = 0;
			endJ = 0; // valores que se han metido fuera de rango
			return;
		}

	} /*----------------- Muestra Menu de Algoritmo -----------------*/

	public void selectAlgoritm() {

		if (loaded && setIO) { // Si el laberinto ya ha sido cargado Y ya se ha metido las coordenadas de E/S

			int option = Interface2.getInt(Config2.algorithMenu);

			switch (option) {
			case 1:// codigo del primer xamino posible para poder seleccionar en el algortimo
				if (findPath(false)) {

					// System.out.println(path.size());
					System.out.println("Camino encontrado");

					/*
					 * for(Coordinate2 i : path) { System.out.println(i.i+", "+
					 * i.j+" - "+i.direction); }
					 */

					step();
					search = true;
					showMap();

				} else {
					System.out.println("No encontrado");
				}
				break;

			case 2:
				 // camino corto
				/*if(paso(false)) {
					step();
					search = true;
					showMap();
				}
				 else {
						System.out.println("No encontrado");
					}*/
				break;
			default:
				break;
			}

		} // Se acaba el if
		else {
			System.err.println("Lo siento laberinto no esta cargado");
		}

	}

	/*
	 * ----------------- IMPLEMENTACIÓN DEL ALGORITMO PARA LOS CAMINOS* ----------------- */
	 

	public boolean findPath(boolean rigth) {
		path = new ArrayList<Coordinate2>();

		// guarda en la casilla inicial en el camino
		Coordinate2 startCell = new Coordinate2();
		// tiene valores asignados
		startCell.i = startI;
		startCell.j = startJ;
		startCell.direction = 0;
		// ArrayList<Coordinate2> rigthPath= new ArrayList<Coordinate2>();
		path.add(startCell);

		while (  path.size() > 0) {// algt
			// incrementar la direccion
			path.get(path.size() - 1).direction += 1;// accede al ultimo elemento

			if (path.get(path.size() - 1).direction <= 4) {
				// comprobaciones casillas
				Coordinate2 nextCell = setNextCell(path.get(path.size() - 1));
				if (checkCell(nextCell)) {
					// casilla valida
					path.add(nextCell);
				}
				if (nextCell.i == endI && nextCell.j == endJ) {// comprueba casiila de salida
					return true;
				}

			} else {
				path.remove(path.size() - 1);// borra la ultima poscion

			}
		}

		return true;

	}

	/* ----------------- IMPLEMENTACIÓN DELCODIGO david ----------------- */

	public Coordinate2 setNextCell(Coordinate2 currentCoord) {

		Coordinate2 nextCoord = new Coordinate2();
		nextCoord.i = currentCoord.i;
		nextCoord.j = currentCoord.j;
		nextCoord.direction = 0;
		// Comprobamos direction recibiendo la coordenada actual
		if (currentCoord.direction == IZQUIERDA) {// izquierda
			nextCoord.j--;
		} else if (currentCoord.direction == ARRIBA) {// arriba
			nextCoord.i--;
		} else if (currentCoord.direction == DERECHA) {// derecha
			nextCoord.j++;
		} else if (currentCoord.direction == ABAJO) {// abajo
			nextCoord.i++;
		}

		return nextCoord;

	}

	private boolean checkCell(Coordinate2 cell) {

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

	public void step() {
		System.out.println("\nPasos: " + path.size());
		System.out.println();
		String direction = " ";
		for (Coordinate2 i : path) {
			if (i.direction == IZQUIERDA) {
				direction = "Izquierda";
			} else if (i.direction == ARRIBA) {
				direction = "Arriba";
			} else if (i.direction == DERECHA) {
				direction = "Derecha";
			} else if (i.direction == ABAJO) {
				direction = "Abajo";
			}
			System.out.println("(" + i.i + ", " + i.j + ") - " + i.direction);
		}

	}

}
