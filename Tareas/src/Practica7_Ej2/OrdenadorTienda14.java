package Practica7_Ej2;

public class OrdenadorTienda14 {
	/*
	 * public static void main(String[] args) { Ordenador or=new Ordenador("aaa",
	 * "bbb", "ccc", 100.52) System.out.println(); }
	 */

}

class Ordenador {

	private String modelo;
	private String marca;
	private String color;
	private double precio;

	public Ordenador(String modelo, String marca, String color, double precio) {

		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.precio = precio;
	}

	public String toString() {
		return this.marca + " " + this.modelo + " " + this.color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
