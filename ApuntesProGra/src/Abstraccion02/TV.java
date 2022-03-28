package Abstraccion02;

public class TV implements Controles {

	private String marca;
	private String modelo;
	private int pulgadas;
	private boolean encendida;
	private int canalID;
	private final int pulgadasMinimas = 6;

	public TV(String marca, String modelo, int pulgadas) {

		this.marca = marca;
		this.modelo = modelo;
		this.pulgadas = pulgadas > pulgadasMinimas ? pulgadas : pulgadasMinimas;
		this.encendida = false;
		this.canalID = 1;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		if (pulgadas > this.pulgadasMinimas) {
			this.pulgadas = pulgadas;
		} else {
			System.out.println("ERROR: las pulgas minimas son " + this.pulgadasMinimas);
		}
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public int getCanalID() {
		return canalID;
	}

	// Funcionalidad y nombre de SETTER modificado
	public void cambiarCanal(int canalID) {
		if (this.encendida && this.canalID != canalID && canalID > 0) {
			this.canalID = canalID;
			System.out.println("Canal cambiado a " + canalID);
		}
	}

	public void setCanalID(int canalID) {
		this.canalID = canalID;
	}

	public void encender() {
		if (this.encendida) {
			this.encendida = true;
			System.out.println("Television encendida");
		} else {
			System.out.println("Ya esta encendida");
		}
	}

	public void apagar() {
		if (this.encendida) {
			this.encendida = false;
			System.out.println("Television apagada");

		}
	}

}
