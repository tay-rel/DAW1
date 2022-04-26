package Practica7_Bolque1;

public class Ejercicio01 {
	public static void main(String[] args) {
		Punto coordenada = new Punto();// Instanciamos la clase

		coordenada.x = 4.5;
		coordenada.y = 8.6;

		System.out.println("Coordenada: " + coordenada.x + " " + coordenada.y);
		// Modificar alguna de sus coordenadas accediendo directamente al atributo
		// correspondiente
		coordenada.y = 3.5;
		System.out.println("Coordenada actual es: " + coordenada.x + " " + coordenada.y);

	}
}

class Punto {
	// Propiedades
	public double x;
	public double y;

}