package Practica7_Ej2;

public class Ejericicio14 {

}

class Punto14 {
	private double x;
	private double y;

	// Constructor
	public Punto14(double x, double y) {
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

	public static double distance(Punto14 a, Punto14 b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
	
	
}