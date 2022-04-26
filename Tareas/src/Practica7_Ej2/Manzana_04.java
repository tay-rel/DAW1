package Practica7_Ej2;

public class Manzana_04 {

	public static void main(String[] args) {

		Manzana man = new Manzana("Verde", 10, 1);
		System.out.println(man.toString());

	}

}

class Manzana {
	private String color;
	private int precio;
	private double peso;

	public Manzana(String color, int precio, double peso) {
		this.color = color;
		this.precio = precio > 0 ? precio : 0;
		this.peso = peso > 0 ? peso : 0;
	}

	public String toString() {
		return "Su color " + this.color + ".\nSu precio" + this.precio + " €" + ".\nSu peso" + this.peso + " kg";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		if (precio > 0) {
			this.precio = precio;
		} else {
			System.out.println("El precio no debe ser negativo");
		}

	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			System.out.println("El precio no debe ser negativo");
		}
	}

}
