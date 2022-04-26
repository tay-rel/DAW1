package Practica7_Ej2;

public class DiscoTienda_10 {

	private String nombre;
	private double precio;

	public DiscoTienda_10(String nombre, double precio) {

		this.nombre = nombre;
		this.precio = precio > 0 ? precio : 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}

	}

}
