package Practica8_Bolque2_Ejercicio04;

public class Triangulo extends FiguraGeometrica{
	

	public Triangulo(double ancho, double alto) {
		super(ancho, alto);
		
		
	}

	@Override
	public double calcularArea() {
		/*double area = (getAlto()*getAncho())/2;
		return area;*/
		return (super.getAlto()/2*super.getAncho()/2);
	}

	
	
	
	
	
}
