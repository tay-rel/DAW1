package Practica7_Ej2;

public class Libro_Biblioteca06 {
	private String nombre;
	private final String ISBN;
	private String Autor;
	private String Genero;
	private String Alquilado;
	private boolean disponible;

	public Libro_Biblioteca06(String nombre, String iSBN, String autor, String genero, String alquilado,
			boolean disponible) {
		this.nombre = nombre;
		this.ISBN = iSBN;
		this.Autor = autor;
		this.Genero = genero;
		this.Alquilado = alquilado;
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

	public String getAlquilado() {
		return Alquilado;
	}

	public void setAlquilado(String alquilado) {
		Alquilado = alquilado;
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
