package Metodos;
/* Ejemplo definición y llamada a método */

import java.util.Scanner;

// Crear método que calcule el porcentaje de un número

public class Metodo3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		double numero = teclado.nextDouble();
		
		System.out.print("Introduce un porcentaje a calcular: ");
		double porcentaje = teclado.nextDouble();
		
		System.out.println("El " + porcentaje + "% de " + numero + " es " + calcularPorcentaje(numero, porcentaje));
		
		System.out.println("El % fijo de " + numero + " es " + calcularPorcentaje(numero));
		
		teclado.close();
	}
	
	static double calcularPorcentaje(double numero, double porcentaje) {
		return (numero / 100) * porcentaje;
	}
	
	static double calcularPorcentaje(double numero) {
		double porcentaje = 50;
		return (numero / 100) * porcentaje;
	}
}
