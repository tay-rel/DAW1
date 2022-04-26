package Practica8_Bolque2_Ejercicio01;

public class Trabajador extends Persona implements Comparable<Trabajador> {

	private double salario;
	private int horastrabajadas;

	public Trabajador(String nombre, String apellidos, int horastrabajadas) {
		super(nombre, apellidos);

		this.horastrabajadas = horastrabajadas >= 0 ? horastrabajadas : 0;
	}

	public String toString() {
		return super.toString() + "Horas trabajadas: " + this.horastrabajadas + "Salario: " + this.salario + " €";
	}

	// metodos setter and getters
	public int getHorastrabajadas() {
		return horastrabajadas;
	}

	public void setHorastrabajadas(int horastrabajadas) {

		if (horastrabajadas >= 0) {
			this.horastrabajadas = horastrabajadas;
		} else {
			System.out.println("Las horas trabajadas no pueden ser negativas");
		}

	}

	public double getSalario() {
		return salario;
	}

	public void calcularSueldo(double precio) { // porque el precio es variable , no un precio fijo
		if (precio >= 0) {
			this.salario = this.horastrabajadas * precio;
		} else {
			System.out.println("Te estan explotando. Huye!!!");

		}

	}

	@Override
	public int compareTo(Trabajador object) {

		// comprobar si la evaluacion actual es mayor que la evaluacion object para
		// devolver el valor"1"
		if (this.salario > object.getSalario()) {
			return 1;
		}
		// comprobar si la evaluacion actual es mayor que la evaluacion object para
		// devolver el valor"-1"

		if (this.salario < object.getSalario()) {
			return -1;
		}

		return 0;
	}
}
