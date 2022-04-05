package Abstraccion02;

public class Jamon extends Alimento {
	
	private String denominacion;

	public Jamon(int peso, int calorias, int grasas, int azucares, int fibra,String denominacion) {
		super(peso, calorias, grasas, azucares, fibra);
		this.denominacion=denominacion;
	}
	
	public String toString() {
		return this.denominacion+" ("+super.getPeso()+" gr.)";
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

}
