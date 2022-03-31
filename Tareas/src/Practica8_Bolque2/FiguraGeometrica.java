package Practica8_Bolque2;

public abstract class FiguraGeometrica  {

	private double ancho;
	private double alto;

	public FiguraGeometrica(double ancho, double alto) {
		this.ancho = ancho > 0 ? ancho : 1;
		this.alto = alto > 0 ? alto : 1;
	}

	public abstract double calcularArea();	//no recibe cuerpo

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		if (ancho > 0) {
			this.ancho = ancho;
		} else {
			System.out.println("Los valores deben ser positivos");
		}

	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		if (alto > 0) {
			this.alto = alto;

		} else {
			System.out.println("Los valores deben ser positivos");
		}
	}

}
