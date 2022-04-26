package Practica7_Ej2;

public class Cancion_Emisora09 {
	private String nombre;
	private double album;
	private String compositor;
	private String disponible;
	private int tiempo;

	public Cancion_Emisora09(String nombre, double album, String compositor, String disponible, int tiempo) {
		this.nombre = nombre;
		this.album = album;
		this.compositor = compositor;
		this.disponible = disponible;
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAlbum() {
		return album;
	}

	public void setAlbum(double album) {
		this.album = album;
	}

	public String getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}

	public String getDisponible() {
		return disponible;
	}

	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

}
