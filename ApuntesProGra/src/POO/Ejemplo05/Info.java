package POO.Ejemplo05;

/* En este ejemplo, vamos a ver como usar un metodo public y estatico
 * de la clase recibiendo dos parametros
 * (Ver Ejemplo.java) */

public class Info {
	public static String bienvenida = "Bienvenido al programa";
	public static String despedida = "Adios, vuelve a probar el programa cuando quieras";
	public static int valor = 10;
	
	/* Este metodo recibe dos parametros y devuelve la suma*/
	public static int hacerSuma(int num1, int num2) {
		return num1 + num2;
	}
}
