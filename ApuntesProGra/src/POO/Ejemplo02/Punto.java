package POO.Ejemplo02;

/* En este ejemplo, ademas de las propiedades publicas X e Y,
 * hemos creado la propiedad PRIVADA (private) Z, la cual tiene
 * un valor de inicio.
 * (Ver Ejemplo.java) */

public class Punto {
	public int x;
	public int y;
	
	private int z = 8;
	
	// Metodo publico para poder obtener el valor de Z desde fuera de la clase
	public int getZ() {
		return z;	// Desde dentro de la clase si podemos leer Z
	}
}
