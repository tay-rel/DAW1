package Collection;

import java.util.Objects;

public class Libro {

	// Propiedades
	private String titulo;
	private String autor;
	private int ISBN;

	// constructor
	public Libro(String titulo, String autor, int ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;

	}// metodo getter,me proporciona la informacion del libro

	public String getDatos() {
		return "El titulo es: " + titulo + "El autor es: " + autor + ". Y el ISBN es: " + ISBN;

	}
//forma1
	/*public boolean equals(Object obj) {
		// operador instanceof, nos permite ver si es una instancia de la clase libro
		if (obj instanceof Libro) {
			Libro otro = (Libro) obj;// convertimos obj en objeto de tipo libro

			if (this.ISBN == otro.ISBN) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}*/

	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return ISBN == other.ISBN;
	}
	
	

}
