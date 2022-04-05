package Practica8_Bolque2;

public class Estudiante extends Persona implements Comparable<Estudiante> {
	// Propiedades
	private double evaluacion;

	public Estudiante(String nombre, String apellidos, double evaluacion) {
		super(nombre, apellidos);// llama al constructor de la clase superior
		this.evaluacion = (evaluacion >= 0 && evaluacion <= 10) ? evaluacion : 0;
	}

	public String toString() {
		// return super.getNombre()+" "+super.getApellidos()+"Evaluacion:
		// "+this.evaluacion; //Primera forma
		return super.toString() + "Evaluacion: " + this.evaluacion; // Segunda forma
	}

	// Metodos setter and getters
	public double getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(double evaluacion) { // si se ha modificado la propiedad se debe modificar en el set
		if (evaluacion >= 0 && evaluacion <= 10) { // que necesite un comprobacio prueba
			this.evaluacion = evaluacion;
		} else {
			this.evaluacion = 0;
		}

	}

	@Override
	public int compareTo(Estudiante object) {
		// comprobar si la evaluacion actual es mayor que la evaluacion object para
		// devolver el valor"1"
		if (this.evaluacion > object.getEvaluacion()) {
			return 1;
		}
		// comprobar si la evaluacion actual es mayor que la evaluacion object para
		// devolver el valor"-1"

		if (this.evaluacion < object.getEvaluacion()) {
			return -1;
		}

		return 0;
	}

}
