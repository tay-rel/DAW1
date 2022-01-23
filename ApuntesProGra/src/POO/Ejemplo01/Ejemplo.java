package POO.Ejemplo01;



public class Ejemplo {
	public static void main(String[] args) {
		/* Creamos una variable(objeto) indicando que es de tipo "Punto" (la clase que hemos definido en Punto.java)
		* la cual contendra las propiedades definidas en la clase Punto
		* */
		Punto puntoActual = new Punto();
		
		/* El objeto punto actual tiene visibles las propiedades "x" e "y" ya que son publicas (public)
		 * y se pueden leer y cambiar su valor como estamos haciendo a continuación
		 * */
		puntoActual.x = 10;
		puntoActual.y = 15;
		
		/* Ahora leemos el nuevo valor que le hemos dado tanto a X como a Y
		 * */
		System.out.println("Coordenadas: X = " + puntoActual.x + " Y = " + puntoActual.y);
	}
}