package Abstraccion02;

public abstract class Alimento {

	private int peso;
	private int calorias;
	private int grasas;
	private int azucares;
	private int fibra;

	public Alimento(int peso, int calorias, int grasas, int azucares, int fibra) {
		this.peso = peso >= 0 ? peso : 0;
		this.calorias = calorias >= 0 ? calorias : 0;
		this.grasas = grasas >= 0 ? grasas : 0;
		this.azucares = azucares >= 0 ? azucares : 0;
		this.fibra = fibra >= 0 ? fibra : 0;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		if (peso > 0) {
			this.peso = peso;
		} else {
			System.err.println("El peso no puede ser negativo");
		}
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		if (calorias > 0) {
			this.calorias = calorias;
		} else {
			System.err.println("Las calorias no pueden ser negativo");
		}
	}

	public int getGrasas() {
		return grasas;
	}

	public void setGrasas(int grasas) {
		if (grasas > 0) {
			this.grasas = grasas;
		} else {
			System.err.println("La grasa no puede ser negativo");
		}
	}

	public int getAzucares() {
		return azucares;
	}

	public void setAzucares(int azucares) {
		if (azucares > 0) {
			this.azucares = azucares;
		} else {
			System.err.println("Los azucares no pueden ser negativo");
		}
	}

	public int getFibra() {
		return fibra;
	}

	public void setFibra(int fibra) {
		if (fibra > 0) {
			this.fibra = fibra;
		} else {
			System.err.println("La fibra no puede ser negativo");
		}
	}

}
