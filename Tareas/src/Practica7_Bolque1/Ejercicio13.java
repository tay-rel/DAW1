package Practica7_Bolque1;
public class Ejercicio13 {
	public static void main(String[] args) {

		Punto13 p1 = new Punto13(7,5);
		Punto13 p2= new Punto13(4,1);
		System.out.println("Su coordenada ( " + p1.getX() + ", " + p1.getY() + " ) ");
		p1.cuadrante();
		System.out.println("Distancia entre P1 y P2 es "+Punto13.distance(p1, p2));
		
	}

}

class Punto13 {
	private double x;
	private double y;

	// Constructor
	public Punto13(double x, double y) {
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

	public static double distance(Punto13 a, Punto13 b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}