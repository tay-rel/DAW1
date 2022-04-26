package Practica7_Bolque1;

public class Ejercicio06 {

	public static void main(String[] args) {

		Punto06 construcor = new Punto06(5.2, 5.6);
		System.out.println("Coordenadas actuales: (" + construcor.getX() + ") (" + construcor.getY() + ")");

		construcor.x = 4.8;
		construcor.y = 4.2;

		System.out.println("Coordenadas modificadas: (" + construcor.getX() + ") (" + construcor.getY() + ")");

	}

}

class Punto06 {
	// Propiedades
	public double x;
	public double y;

	public Punto06(double x, double y) {
		this.x = x;
		this.y = y;

	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

}