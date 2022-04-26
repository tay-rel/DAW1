package Practica7_Ej2;

public class OrdenadorInventario {

	public static void main(String[] args) {

		OrdenadorI orga = new OrdenadorI(5, "Viejo", "LENOVO");
		System.out.println(orga.getEstado());
	}

}

class OrdenadorI {
	private int cantidad;
	private String estado;
	private String modelo;

	public OrdenadorI(int cantidad, String estado, String modelo) {

		this.cantidad = cantidad;
		this.estado = estado;
		this.modelo = modelo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}