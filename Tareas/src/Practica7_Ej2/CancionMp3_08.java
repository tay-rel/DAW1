package Practica7_Ej2;

public class CancionMp3_08 {
	private String nombre;
	private double frecuencia;
	private String modo;
	private int compresion;
	private String calidad;
	private int velocidadBinaria;

	public CancionMp3_08(String nombre, double frecuencia, String modo, int compresion, String calidad,
			int velocidadBinaria) {
		this.nombre = nombre;
		this.frecuencia = frecuencia;
		this.modo = modo;
		this.compresion = compresion;
		this.calidad = calidad;
		this.velocidadBinaria = velocidadBinaria;
	}

	public String toString() {
		return "Frecuencia: " + this.frecuencia + " Hz" + "Modo: " + this.modo + "Velocidad Binaria: "
				+ this.velocidadBinaria + " kbps" + "Calidad: " + this.calidad + "Compresion: " + this.compresion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

	public int getCompresion() {
		return compresion;
	}

	public void setCompresion(int compresion) {
		this.compresion = compresion;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public int getVelocidadBinaria() {
		return velocidadBinaria;
	}

	public void setVelocidadBinaria(int velocidadBinaria) {
		this.velocidadBinaria = velocidadBinaria;
	}

}
