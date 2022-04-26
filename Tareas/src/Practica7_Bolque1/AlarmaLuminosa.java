package Practica7_Bolque1;

public class AlarmaLuminosa extends Alarma {
	// private Bombilla b;

	public AlarmaLuminosa(double umbral, Sensor sensor, Timbre timbre) {
		super(umbral, sensor, timbre);
		// this.b = b;

	}

	public void activarTimbre(Timbre on, Bombilla luz) {
		if (on.isEstado() == true && luz.isEstado() == true) {
			on.activar();
			luz.activar();
		} else if (on.isEstado() == false && luz.isEstado() == false) {
			on.desactivar();
			luz.desactivar();
		}
	}

}

class Bombilla {

	private boolean estado;

	public Bombilla(boolean estado) {
		this.estado = estado;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;

	}

	public void activar() {
		setEstado(true);
		System.out.println("La luz esta encendida");
	}

	public void desactivar() {
		setEstado(false);
		System.out.println("La luz esta apagada");
	}

}