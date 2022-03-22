package UsoConstantesFinal_36pI;

public class Prueba {
	/*
	 * Static sera compartida por todos los objetos que estemos utilizando. FINAL el
	 * valor de algo , no se puede modificar.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados e1 = new Empleados("Benito");
		Empleados e2 = new Empleados("Paco");
		Empleados e3 = new Empleados("Antonio");
		e1.cambiaSeccion("Informatica");
		e2.cambiaSeccion("RRHH");
		// e1.cambiaNombre("Luciana");

		// Static

		System.out.println(e1.getDatos());
		System.out.println(e2.getDatos());
		System.out.println(e3.getDatos());
	}

}

class Empleados {
	// propiedades
	private final String nombre;
	private String seccion;
	// Hay un unico id para cada objeto por eso se usa STATIC
	private int id;
	private static int IdSiguiente = 1;

	// Constructor
	public Empleados(String name) {

		nombre = name;
		// Todo trabajador que pertenezca a Class empleados pertenece a administración
		seccion = "Administracion";

		id = IdSiguiente;
		IdSiguiente++;// incrementa en uno el valor de la variable siguiente

	}

	/*
	 * No se puede modificar el nombre public void cambiaNombre(String name) {
	 * this.nombre=name; }
	 */
	public void cambiaSeccion(String secc) {// metodo setter
		this.seccion = secc;
	}

	public String getDatos() {// metodo getter
		return "El nombre es: " + nombre + " y la seccion es " + seccion + "y el id= " + id;
	}

}