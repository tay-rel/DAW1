package Classes;

/*implementar la funcionalidad de las opciones 1, 2 y 3*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Labyrinth {

	// propiedades
	private char[][] map;
	private String filename;
	private boolean loaded;
	private int startI, startJ, endI, endJ;

	// constructor
	public Labyrinth() {
		loaded = false;
	}

	private File listDirectory() throws IOException {
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

			System.err.println("No se ha podido acceder al directorio de laberintos");

		}

		System.out.print("\nEliga una opción: ");
		int option = entry.nextInt();

		return files[option - 1];

	}

	public void loadLabyrinth() throws IOException, InterruptedException {

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
					map[i][j] = lines.get(i).charAt(j); // guarda lo que hay linea i
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
				} else { //cuando es mayor a 9
					System.out.print(String.valueOf(a).charAt(0) + " ");
				}
			}

			// recorre numeros linea debajo

			System.out.print("\n   ");

			for (int m = 0; m < map.length; m++) {
				if (m < 10) {
					System.out.print( m + " ");
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
			System.out.println("Vuelva a intentarlo,porfavor");
		}

	}

}