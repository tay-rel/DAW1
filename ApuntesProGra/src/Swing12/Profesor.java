package Swing12;

public class Profesor {

	private String nombre, apellido1, apellido2, departamento;

	public Profesor(String nombre, String apellido1, String apellido2, String departamento) {

		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.departamento = departamento;
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

	public String getDepartamento() {
		return departamento;
	}

}
