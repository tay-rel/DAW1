package POO.Ejemplo02;



public class Ejemplo {
	public static void main(String[] args) {
		/* Creamos una variable(objeto) indicando que es de tipo "Punto" (la clase que hemos definido en Punto.java)
		* la cual contendra las propiedades definidas en la clase Punto
		* */
		Punto puntoActual = new Punto();
		
		/* Si ejecutamos esta instruccion, dara error ya que no se puede leer la propiedad Z
		 * desde fuera de la definicion de su clase, ya que es privada*/
		
		//System.out.println("Valor de Z = " + puntoActual.z);
		
		/* Si queremos leer la propiedad Z, tenemos que hacer uso
		 * del metodo publico que hemos creado para tal fin,
		 * de esta forma, desde fuera de la clase podemos leer Z,
		 * pero no cambiarle su valor*/
		System.out.println("Valor de Z = " + puntoActual.getZ());
	}
}