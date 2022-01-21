package Classes;
public class Config{//Guarda propiedades estaticas
	
	//todas las clases seran public,static,final
	public static final String version="v0.1.0";
	public static final int miliseconds=2000;
	
	public static final String filePath="/home/daw21-16/Escritorio/eclipsePL/Practicas/Prototipo0.1.0/assets/files/";
	public static final String labyrinthsPath="/home/daw21-16/Escritorio/eclipsePL/Practicas/Prototipo0.1.0/assets/labyrinths/";
	public static final String usersFile="users.txt";
	
	public static final String welcome ="Soluciona laberinto\t("+ version+")";
	public static final String goodbye="Fin del programa";
	public static final String unLoggedMenu=" 1 Iniciar sesión\n 2 Registro\n 0 Salir\n"+"Seleccionar una opción: ";
	
	public static final String LoggedMenu=
			"\t Menú\n1 Cargar laberinto\n"
			+ "2 Ver laberinto actual\n"
			+ "3 Establecer casillas de entrada y salida\n"
			+ "4 Buscar caminos\n"
			+ "5 Ver usuario actual\n"
			+ "6 Cerrar sesión\n0 Salir\n"
			+ "Seleccione una opción: ";
}