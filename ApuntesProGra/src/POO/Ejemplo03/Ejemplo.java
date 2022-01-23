package POO.Ejemplo03;



public class Ejemplo {
	public static void main(String[] args) {
		/* El metodo del CONSTRUCTOR se ejecuta cuando llamamos a "new Punto()"
		* */
		Punto puntoActual = new Punto();
		
		// Ahora mostramos por pantalla los valores de las propiedades del objeto "puntoActual"
		System.out.println("Valores");
		System.out.println("X = " + puntoActual.x);
		System.out.println("Y = " + puntoActual.y);
		System.out.println("Z = " + puntoActual.getZ());
	}
}