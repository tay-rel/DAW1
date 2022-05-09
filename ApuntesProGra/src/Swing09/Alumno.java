package Swing09;

public class Alumno {

	
	private String nre,nombre,apellido1,apellido2,dni,email;

	public Alumno(String nre, String nombre, String apellido1, String apellido2, String dni, String email) {
		this.nre = nre;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.email = email;
	}

	public String getNre() {
		return nre;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public String getDni() {
		return dni;
	}

	public String getEmail() {
		return email;
	}
	
}
