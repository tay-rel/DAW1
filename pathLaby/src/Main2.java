import java.io.IOException;

import Class.Config2;
import Class.Interface2;
import Class.Labyrinth2;
import Class.Config2;
import Class.Interface2;
/* @A.A.M.S - DAW1
 * 
 * @Consiste en el desarrollo de un proyecto cuyo objetivo principal es la búsqueda de un camino factible 
 * y el camino mas corto a traves de un laberinto construido sobre una matriz de caracteres.
 */


public class Main2 {
	public static Labyrinth2 labyrinth2 = new Labyrinth2();

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		// comprueba si esta loggeado
				int option = -1;// 1

				while (option != 0) {
					//if (!session.islogged()) {// comprueba si la sesion esta iniciada
						option = Interface2.getInt(Config2.LoggedMenu);
						loggedAction(option);

					//} else if (session.islogged()) {// cuando la sesion este iniciada
						option = Interface2.getInt(Config2.LoggedMenu);
						loggedAction(option);
					//}

				}


	}

	private static void loggedAction(int option) throws InterruptedException, IOException {
		// int miliseconds=2000;
		switch (option) {
		case 1:

			labyrinth2.loadLabyrinth();
			Thread.sleep(Config2.miliseconds);
			break;
		case 2:
			labyrinth2.showMap();
			Thread.sleep(Config2.miliseconds);
			Interface2.toContinue();
			break;
		case 3:
			labyrinth2.showMap();
			labyrinth2.setEntraceExit();
			Thread.sleep(Config2.miliseconds);
			break;
		case 4:
			labyrinth2.selectAlgoritm();
			Thread.sleep(Config2.miliseconds);

			break;
		/*case 5:
			// muestra al usuario cuando tiene la session iniciada
			session.showUser();
			break;
		case 6:
			System.out.println("\nCerrando sesion");
			session.logout();
			// tiempo de espera
			Thread.sleep(Config.miliseconds);
			break;*/

		}

	}
}
