package Practica8_Bolque2_Ejercicio04;

public class Main {

	public static void main(String[] args) {

		System.out.println("	//Figuras geometricas");

		Rectangulo rec = new Rectangulo(2, 4.5);
		System.out.println("Area de rectangulo: " + rec.calcularArea());

		Triangulo tri = new Triangulo(2, 4.5);

		Circulo cir = new Circulo(3);
		System.out.println("Area de circulo: " + cir.calcularArea());

	}

}
