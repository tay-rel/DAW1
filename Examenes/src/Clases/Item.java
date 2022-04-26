package Clases;

public class Item {

	private String nombre;
	private String descripcion;
	private double precio;

	public Item(String nombre, String descripcion, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio >= 0 ? precio : 0; // El precio no debe ser negativo
	}
	
	public String toString() {
		return this.nombre+" "+this.precio+" €";
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio >= 0 ? precio : 0;
	}

}
