package Abstraccion02;

public class Tomate extends Alimento{
	private String variedad;
	private String color;
	
	
	public Tomate(int peso, int calorias, int grasas, int azucares, int fibra, String variedad, String color) {
		super(peso, calorias, grasas, azucares, fibra);
		this.variedad=variedad;
		this.color=color;
	}

	public String toString() {
		return this.variedad + "( "+super.getPeso()+" gr.)";
	}

	public String getVariedad() {
		return variedad;
	}


	public void setVariedad(String variedad) {
		this.variedad = variedad;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

}
