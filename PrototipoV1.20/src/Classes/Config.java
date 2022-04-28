package Classes;

public class Config {// Guarda propiedades estaticas

	// todas las clases seran public,static,final
	public static final String version = "v1.1.0";
	public static final int miliseconds = 2000;
	public static final String labyrinthsPath = "C:\\Users\\tay-r\\Documents\\Java\\DAW1\\Prototipo0.2.0\\assets\\labyrinths\\";
	public static final String logEvent = "C:\\Users\\tay-r\\Documents\\Java\\DAW1\\PrototipoV1.2.0\\assets\\files\\";
	public static final String saveEvent = "syslog.txt";
	public static final String usersFile = "users.txt";

	public static final String welcome = "\t\t\\s*Soluciona laberinto(" + version + ")*\n"
			+ "\tConsiste en el desarrollo de un proyecto cuyo objetivo \n"
			+ "\tprincipal es la busqueda de un camino factible\n"
			+ "\ty el camino mas corto a traves de un laberinto\n" + "\tconstruido sobre una matriz de caracteres.\n";
	public static final String goodbye = "\n\tFin del programa";
	public static final String unLoggedMenu = "------------------------------\n 1. Iniciar sesion\n 2. Registro\n 0. Salir\n"
			+ "------------------------------" + "\nSeleccionar una opcion: ";

	public static final String LoggedMenu = "\n\t<<<Menu>>>\n" + "\n1. Cargar laberinto\n" + "2. Ver laberinto actual\n"
			+ "3. Establecer casillas de entrada y salida\n" + "4. Buscar caminos\n" + "5. Ver usuario actual\n"
			+ "6. Modificación de datos\n" + "7. Cerrar sesion\n0. Salir\n" + "\nSeleccione una opcion: ";
	public static final String algorithMenu = "\n\t<<<Selelcciona un camino>>>\n\t------------------------"
			+ "\n1- Primer camino posible \n" + "2- El camino mas corto\n" + "0- Salir\n"
			+ "\nSeleccionar una opcion: ";
	public static final String modificationMenu = "------------------------------\n 1. Modificar datos\n 2. Eliminar usuario\n 0. Salir\n"
			+ "------------------------------" + "\nSeleccionar una opcion: ";

}