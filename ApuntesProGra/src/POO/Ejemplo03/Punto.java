package POO.Ejemplo03;


/* En este ejemplo, ademas de las propiedades publicas X, Y y Z,
 * vamos a establecer sus valores iniciales mediante un CONSTRUCTOR,
 * el cual se ejecuta cuando se crea un objeto de este tipo de clase
 * (Ver Ejemplo.java) */

public class Punto {
	public int x;
	public int y;
	private int z;
	
	/* El CONSTRUCTOR debe llamarse IGUAL que la clase
	 * sin tipo de valor de return, ni siquiera void
	 */
	public Punto() {
		x = 10;
		y = 15;
		z = 8;
	}
	
	public int getZ() {
		return z;
	}
}
