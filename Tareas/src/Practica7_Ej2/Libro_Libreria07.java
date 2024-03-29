package Practica7_Ej2;

public class Libro_Libreria07 {

	private String nombre;
	private final String ISBN;
	private String Autor;
	private String Genero;
	private int precio;;
	private boolean disponible;

	public Libro_Libreria07(String nombre, String iSBN, String autor, String genero, int precio, boolean disponible) {
		this.nombre = nombre;
		this.ISBN = iSBN;
		this.Autor = autor;
		this.Genero = genero;
		this.precio = precio;
		this.disponible = disponible;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getISBN() {
		return ISBN;
	}

}
