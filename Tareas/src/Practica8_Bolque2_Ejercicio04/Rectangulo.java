package Practica8_Bolque2_Ejercicio04;

public class Rectangulo extends FiguraGeometrica {

	public Rectangulo(double ancho, double alto) {
		super(ancho, alto);
		
	}

	@Override
	public double calcularArea() {
		//double area=getAncho()*getAlto();
		return super.getAlto()*super.getAncho();
	}

	
	
	
	
	
}
