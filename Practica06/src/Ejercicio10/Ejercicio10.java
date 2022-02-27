package Ejercicio10;

public class Ejercicio10 {
	public static void main(String[] args) {
		ListaDoble listaCompra = new ListaDoble();
		listaCompra.add("Leche");
		listaCompra.add("Galletas ");
		listaCompra.add("Cereales");
		listaCompra.add("Lacasitos");
		listaCompra.add("Tarta");
		listaCompra.add("Vodka");
		System.out.println("Lista de la compra " + listaCompra.size() + " elementos");
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println(listaCompra.get(i));//obtenemos un elemento a partir del limite 
		}
		
		System.out.println("\nLista de la compra " + listaCompra.size() + " elementos");
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.println(listaCompra.getInverso(i));//obtenemos un elemento a partir del limite 
		}
	}
}

/**
 * Representa la implementación básica de una lista doble enlazada.
 */

class ListaDoble {
	private Nodo primero;
	private Nodo ultimo;
	private int numElementos;

	/**
	 * Constructor que inicializa los atributos al valor por defecto.
	 */
	public ListaDoble() {
		primero = null;
		ultimo = null;
		numElementos = 0;
	}

	/**
	 * Añade un elemento al final de la lista
	 * 
	 * @param dato - el dato del elemento a añadir que no sea null
	 */
	public void add(Object dato) {
		addUltimo(dato);
	}

	/**
	 * Inserta un elemento en la posición indicada de la lista.
	 * 
	 * @param indice - posición donde insertar el nuevo nodo.
	 * @param dato   - el dato del elemento a añadir. Admite que sea null.
	 * @exception IndexOutOfBoundsException. índice no está entre 0 y numElementos
	 *                                       numElementos-1
	 */
	public void add(int indice, Object dato) {
		// Lanza excepción si el índice no es válido.
		if (indice < 0 || indice >= numElementos) {
			throw new IndexOutOfBoundsException("Índice incorrecto: " + indice);
		}
		// Nuevo nodo al principio.
		if (indice == 0) {
			insertarPrimero(dato);
		}

		// Nuevo nodo en posiciones intermedias.
		if (indice > 0) {
			insertarIntermedio(indice, dato);
		}
	}

	/**
	 * Inserta un elemento en una posición intermedia de una lista doble enlazada.
	 * 
	 * @param el índice que ocupará el elemento nuevo.
	 * @param el dato del elemento nuevo.
	 */
	private void insertarIntermedio(int indice, Object dato) {
		assert indice >= 0 && indice < numElementos;
		Nodo nuevo = new Nodo(dato);
		Nodo actual = obtenerNodo(indice); // Donde insertar.
		Nodo anterior = actual.anterior; // Obtiene el anterior.
		actual.anterior = nuevo; // Enlaza el nuevo nodo.
		anterior.siguiente = nuevo;
		nuevo.anterior = anterior; // Ajusta enlaces.
		nuevo.siguiente = actual;
		numElementos++; // Actualiza tamaño.
	}

	/**
	 * Inserta un elemento al principio de una lista doble enlazada.
	 * 
	 * @param el dato del elemento nuevo.
	 */
	private void insertarPrimero(Object dato) {
		Nodo nuevo = new Nodo(dato);

		// La lista está vacía; el nuevo nodo es primero y último.
		if (numElementos == 0) {
			primero = nuevo;
			ultimo = nuevo;
		}
		// La lista no está vacía; el nuevo nodo pasa a ser el primero.
		else {
			Nodo actual = primero; // Dónde insertar.
			actual.anterior = nuevo; // Enlaza el nuevo nodo.
			nuevo.siguiente = actual; // Ajusta enlace.
			primero = nuevo; // Actualiza el nuevo primero.
		}
		numElementos++; // Actualiza tamaño.
	}

	/**
	 * Añade un elemento al final de una lista doble enlazada.
	 * 
	 * @param el dato del elemento nuevo.
	 */
	private void addUltimo(Object dato) {
		Nodo nuevo = new Nodo(dato);
		// La lista está vacía; el nuevo nodo es último y primero.
		if (numElementos == 0) {
			ultimo = nuevo;
			primero = nuevo;
		}
		// La lista no está vacía; el nuevo nodo pasa a ser el último.
		else {
			Nodo actual = ultimo; // Dónde insertar.
			actual.siguiente = nuevo; // Enlaza el nuevo nodo.
			nuevo.anterior = actual; // Ajusta enlace.
			ultimo = nuevo; // Actualiza el nuevo último.
		}
		numElementos++; // Actualiza tamaño.
	}

	/**
	 * Obtiene el nodo correspondiente al índice.
	 * 
	 * @param indice - posición del nodo a obtener.
	 * @return el nodo que ocupa la posición indicada por el índice.
	 */
	private Nodo obtenerNodo(int indice) {
		assert indice >= 0 && indice < numElementos;
		// Recorre la lista hasta llegar a la posición buscada.
		Nodo actual = primero;
		for (int i = 0; i < indice; i++) {
			actual = actual.siguiente;
		}
		return actual;
	}

	/*
	 * Obtine el nodo correspondiente al indice de forma inversa .
	 */

	private Nodo obtenerNodoInverso(int indice) {

		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Indice incorrecto: " + indice);
		}
		// recorre la lista hasata llegar a la posicion buscada
		Nodo actual = ultimo;
		for (int i = numElementos - 1; i > indice; i--) {
			actual = actual.anterior;
		}
		return actual;
	}

	public Object get(int indice) {
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Indice incorrecto: " + indice);
		}
		Nodo aux = obtenerNodo(indice);
		return aux.dato;
	}

	public Object getInverso(int indice) {
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Indice incorrecto: " + indice);
		}
		Nodo aux = obtenerNodo(indice);
		return aux.dato;
	}

	public int indexOf(Object dato) {
		Nodo actual = primero;
		for (int i = 0; actual != null; i++) {
			if ((actual.dato != null && actual.dato.equals(dato)) || actual.dato == dato) {
				return i;
			}
			actual = actual.siguiente;
		}
		return -1;
	}

	/*
	 * Comprueba si el elemnto esta en la lista
	 */
	public boolean contains(Object dato) {
		return indexOf(dato) != -1;
	}

	/* @return el numero de elementos de la lista */
	public int size() {
		return numElementos;
	}
} // class

/**
 * Representa la estructura de un nodo para una lista enlazada doble.
 */
class Nodo {
	Object dato;
	Nodo anterior;
	Nodo siguiente;

	/**
	 * Constructor que inicializa atributos por defecto.
	 * 
	 * @param dato - el elemento de información útil a almacenar.
	 */
	public Nodo(Object dato) {
		this.dato = dato;
		anterior = null;
		siguiente = null;
	}

} // class
