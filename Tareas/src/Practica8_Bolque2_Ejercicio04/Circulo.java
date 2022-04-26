package Practica8_Bolque2_Ejercicio04;

public class Circulo extends FiguraGeometrica {

	public Circulo(double radio) {
		super(radio * 2, radio * 2);// le esta enviando el contenido de la variable

	}

	@Override
	public double calcularArea() {
		// double area=Math.PI*((getAncho()/2)*(getAlto()/2)*2);
		// double area2=Math.PI*Math.pow(getAlto()/2, 2)*Math.pow(getAncho()/2, 2);
		return Math.PI * Math.pow(super.getAlto() / 2, 2);// llamo a uno porque es lo mismo
	}

}
