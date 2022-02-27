package Ejercicio01;

public class Ejercicio01 {
	public static void main(String[] args) {
		ListaArray listaCompra = new ListaArray();
		listaCompra.add("Leche");
		listaCompra.add("Miel");
		listaCompra.add("Aceitunas");
		listaCompra.add("Cerveza");
		listaCompra.remove("Aceitunas");
		listaCompra.add(1, "Fruta");
		listaCompra.add(0, "Queso");
		listaCompra.add(4, "Verduras");

		System.out.format("Los %d elementos de la lista de la compra son:\n", listaCompra.size());
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.format("%s\n", listaCompra.get(i));
		}
		System.out.format("¿Hay pan en la lista? %b", listaCompra.contains("Pan"));

	}
}

	class ListaArray {

	// Atributos
	private Object[] arrayElementos;
	private int numElementos;
	private static final int TAMAÑO_INICIAL = 4;

	// MÃ©todos
	/**
	 * Inicializa el array de elementos de la lista.
	 */
	public ListaArray() {
		arrayElementos = new Object[TAMAÑO_INICIAL];
		numElementos = 0;
	}

	/**
	 * @return numero de elementos actual en la lista.
	 */
	public int size() { // Numero de elemntos que tiene guardado la estructura
		return numElementos;
	}

	/*
	 * AÃ±ade un elemento a la lista*
	 * 
	 * @param elemento - el elemento a aÃ±adir
	 */

	public void add(Object elemento) {
		if (numElementos == 0) {
			arrayElementos[0] = elemento;
			numElementos++;
		} else {
			comprobarLlenado();
			arrayElementos[numElementos] = elemento;
			numElementos++;
		}
	}

	/**
	 * Comprueba si el array si el array interno estÃ¡ casi lleno y lo copia
	 * ampliando al doble su tamaño.
	 */
	private void comprobarLlenado() {
		// El array interno estÃ¡ casi lleno, se duplica el espacio.
		if (numElementos + 1 == arrayElementos.length) {// que el contador sea igual que la longitud
			Object[] arrayAmpliado = new Object[arrayElementos.length * 2];
			System.arraycopy(arrayElementos, 0, arrayAmpliado, 0, numElementos);
			arrayElementos = arrayAmpliado;
		}
	}

	/**
	 * Inserta un elemento en la posicion especificada por el Indice.
	 * 
	 * @param indice   - indica la posicion de insercion en la lista.
	 * @param elemento - elemento a insertar.
	 * @throws IndexOutOfBoundsException
	 */
	public void add(int indice, Object elemento) {
		// El Ã­ndice debe ser vÃ¡lido.
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Indice incorrecto: " + indice);
		}
		comprobarLlenado();

		// InserciÃ³n, desplaza los elementos desde Indice indicado.
		if (indice < numElementos) {
			System.arraycopy(arrayElementos, indice, arrayElementos, indice + 1, numElementos - indice);
		}
		arrayElementos[indice] = elemento;
		numElementos++;
	}

	/**
	 * Devuelve el Indice de la primera ocurrencia para el objeto especificado.
	 * 
	 * @param elem - el elemento buscado.
	 * @return el Ã­ndice del elemento o -1 si no lo encuentra.
	 */
	public int indexOf(Object elem) {
		if (elem == null) {
			for (int i = 0; i < arrayElementos.length; i++) {
				if (arrayElementos[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = 0; i < arrayElementos.length; i++) {
				if (elem.equals(arrayElementos[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	/**
	 * Borra todos los elementos de la lista.
	 */
	public void clear() {
		arrayElementos = new Object[TAMAÑO_INICIAL];
		numElementos = 0;
	}

	/**
	 * Comprueba si existe un elemento.
	 * 
	 * @param elem â€“ el elemento a comprobar.
	 * @return true - si existe.
	 */
	public boolean contains(Object elem) {
		return indexOf(elem) != -1;
	}

	/**
	 * Obtiene el elemento-dato por Ã­ndice.
	 * 
	 * @param indice - posiÃ³n relativa del nodo que contiene el elemento-dato.
	 * @return el dato indicado por el Ã­ndice de nodo; null si estÃ¡ indefinido.
	 * @exception IndexOutOfBoundsException - Ã­ndice no estÃ¡ entre 0 y
	 *                                      numElementos-1.
	 */
	public Object get(int indice) {
// El Ã­ndice debe ser vÃ¡lido para la lista.
		if (indice >= numElementos || indice < 0) {
			throw new IndexOutOfBoundsException("Ã�ndice incorrecto: " + indice);
		}
		return arrayElementos[indice];
	}
	/**
	 * Elimina el elemento especificado en el Ã­ndice.
	 * @param indice - del elemento a eliminar.
	 * @return - el elemento eliminado.
	* @exception IndexOutOfBoundsException - Ã­ndice no estÃ¡ entre 0 y numElementos-1.
	 */
	public Object remove(int indice) {
	// El Ã­ndice debe ser vÃ¡lido para la lista.
	if (indice >= numElementos || indice < 0) {
	throw new IndexOutOfBoundsException("Ã�ndice incorrecto: " + indice);
	}
	// Elimina desplazando uno hacia la izquierda, sobre la posiciÃ³n a borrar.
	Object elem = arrayElementos[indice];
	System.arraycopy(arrayElementos, indice+1, arrayElementos, indice, numElementos - (indice+1));

	// Ajusta el Ãºltimo elemento.
	arrayElementos[numElementos-1] = null;
	numElementos--;
	return elem;
	}
	//[1,2,3,4,5]=Si se eleimina la posicion ,los numeros se desplazan a la izquierda
	 
	/**
	 * Elimina el elemento especificado.
	 * @param elemento - elemento a eliminar.
	 * @return - el Ã­ndice del elemento eliminado o -1 si no existe.
	 */
	public int remove(Object elem) {
	int indice = indexOf(elem);

	if (indice != -1) {
	 remove(indice);
	        }         
	return indice;
	}


}
// class