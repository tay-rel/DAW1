package Practica7_Bolque1;

public class Ejercicio04 {
	public static void main(String[] args) {

		Timbre ti = new Timbre(false);
		Sensor sen = new Sensor(3);

		/*Alarma g = new Alarma(5, sen, ti);
		g.comprobar();*/

		Bombilla luz = new Bombilla(false);

		AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(5, sen, ti);
		alarmaLuminosa.activarTimbre(ti, luz);
	}

}

class Alarma {
	private double umbral;
	private Sensor sensor;
	private Timbre timbre;

	public Alarma(double umbral, Sensor sensor, Timbre timbre) {
		this.umbral = umbral;
		this.setSensor(sensor);
		this.timbre = timbre;
	}

	public void comprobar() {
		if (getSensor().getValorActual() >= umbral) {
			timbre.activar();
		} else {
			timbre.desactivar();
		}
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public double getUmbral() {
		return umbral;
	}

	public void setUmbral(double umbral) {
		this.umbral = umbral;
	}

}

class Sensor {
	public double valorActual;

	public Sensor(double valorActual) {
		this.valorActual = valorActual;
	}

	public double getValorActual() {
		return valorActual;
	}
}

class Timbre {
	private boolean estado;

	public Timbre(boolean estado) {

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
		System.out.println("El timbre esta activo");
	}

	public void desactivar() {
		setEstado(false);
		System.out.println("El timbre esta desactivado");
	}
}
