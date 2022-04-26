package Practica7_Bolque1;

public class Ejercicio07 {

	public static void main(String[] args) {

		Punto7 p = new Punto7(4, -5);

		System.out.println("Su coordenada ( " + p.getX() + ", " + p.getY() + " ) ");
		p.cuadrante();

	}

}

class Punto7 {
	private double x;
	private double y;

	// Constructor
	public Punto7(double x, double y) {
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

	public void cuadrante() {

		if (x == 0 && y == 0) {
			System.out.println("Esta en el origen");
		}
		if (x == 0) {
			System.out.println("Esta en el eje X ");
		}
		if (y == 0) {
			System.out.println("Esta en el eje Y");
		}

		if (x > 0 && y > 0) {
			System.out.println("Esta en el cuadrante I");
		} else if (x < 0 && y > 0) {
			System.out.println("Esta en el cuadrante II");
		} else if (x < 0 && y < 0) {
			System.out.println("Esta en el cuadrante III");
		} else if (x > 0 && y < 0) {
			System.out.println("Esta en el cuadrante VI");
		}

	}
}