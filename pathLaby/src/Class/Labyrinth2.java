package Class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
	//private static int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	// public int count=0;
	private final int ARRIBA = 1;
	private final int ABAJO = 2;
	private final int IZQUIERDA = 3;
	private final int DERECHA = 4;
	private int filas;

	private int columnas;

	private int[][] casillas;


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
		startI = Interface2.getInt("Columna [E]: ");
		endI = Interface2.getInt("Fila [E]: ");
		startJ = Interface2.getInt("Columna [S]: ");
		endJ = Interface2.getInt("Fila [S]: ");

		try {
			// si son iguales
			if (startI == startJ && endI == endJ) {
				System.err.println("\nLo siento los valores no son validos");
				return;

			}
			// entrada
			if (map[startI][endI] != ' ') {
				System.err.println("\n�Opps! Te has encontrado con una pared");
				return;
			} // salida
			if (map[startJ][endJ] != ' ') {
				System.err.println("\n¡Opps! Te has encontrado con una pared");
				return;
			}

			map[startI][endI] = 'E';
			map[startJ][endJ] = 'S';
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
		if (loaded && setIO) { // Si el laberinto ya ha sido cargado
			// Si ya se ha metido las coordenadas de E/S
			int option = Interface2.getInt(Config2.algorithMenu);

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

		} // 

	}

	/* ----------------- IMPLEMENTACION DEL ALGORITMO ----------------- */

	public boolean  findPath(int y,int x) {	
		ArrayList<Coordinate2> path= new ArrayList<Coordinate2>();
		
		
		if(map[y][x]== '#' && startI == startJ && endI == endJ  ) {
			return true;
		}
		
	
		List<Integer> direcciones[] = new ArrayList[filas * columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int numero = i * columnas + j;
				direcciones[numero] = new ArrayList<Integer>();

				if (i != 0) { // si no estoy en la primera fila, puedo ir hacia arriba
					direcciones[numero].add(ARRIBA);
				}
				if (i != filas - 1) { // si no estoy en la ultima fila, puedo ir hacia abajo
					direcciones[numero].add(ABAJO);
				}
				if (j != 0) { // si no estoy en la primera columna, puedo ir hacia la izquierda
					direcciones[numero].add(IZQUIERDA);
				}
				if (j != columnas - 1) { // si no estoy en la ultima columna, puedo ir hacia la derecha
					direcciones[numero].add(DERECHA);
				}
				// Desordenamos el arreglo de posiciones para tener aleatoriedad en las
				// direcciones tomadas en el recorrido
				Collections.shuffle(direcciones[numero]);
			}
		}

		return true;
		
		
	}
	public void printPath(char direc) {
		
		
		for (int i = 0; i < casillas.length; i++) {
			if(startI == startJ && endI == endJ) {
				
			}
		}
	
	}

}
