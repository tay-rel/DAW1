package Practica8_Bolque2_Ejercicio05;

abstract class Animal {

	private String nombre;
	private String sexo;
	private int edad;

	public abstract void sonidoCaracteristico();

	public Animal(String nombre, String sexo, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}
	public String toString() {
		return "Nombre: "+this.nombre+" Sexo: "+this.sexo+" Edad: "+this.edad+" años";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
