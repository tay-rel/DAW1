package Practica8_Bolque2_Ejercicio01;

public class Persona {
	// propiedades
	private String nombre;
	private String apellidos;

	// Constructor
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	// Metodo String
	public String toString() {
		return this.nombre + " " + this.apellidos;
	}

	// Metodos Getters/Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
