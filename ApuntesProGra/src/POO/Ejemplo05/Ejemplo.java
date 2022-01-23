package POO.Ejemplo05;



public class Ejemplo {
	public static void main(String[] args) {
		/* En este ejemplo vemos como llamar a un metodo estatico de una clase
		 * pasando valores como parametros*/
		
		// Declaramos dos variables locales
		int a = 10, b = 5;
		
		// Llamamos al metodo "hacerSuma" pasando el valor de la variables
		System.out.println("La suma es: " + Info.hacerSuma(a, b));
	}
}