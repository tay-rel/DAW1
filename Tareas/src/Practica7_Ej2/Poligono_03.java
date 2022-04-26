package Practica7_Ej2;

public class Poligono_03 {

	private int[] vertices;
	private int x;
	private int y;
	private int radio;
	private int lados;

	public Poligono_03(int[] vertices, int x, int y, int radio, int lados) {
		this.vertices = vertices;
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.lados = lados >= 3 ? lados : 3; // Un poligono debe tener como minimo tres lados
	}

	public int[] getVertices() {
		return vertices;
	}

	public void setVertices(int[] vertices) {
		this.vertices = vertices;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		if (lados >= 3) {
			this.lados = lados;
		} else {
			System.err.println("Un poligono debe tener como minimo tres lados");
		}

	}

}
