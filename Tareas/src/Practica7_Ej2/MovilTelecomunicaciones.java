package Practica7_Ej2;

public class MovilTelecomunicaciones extends movil {

	private String codigoCliente;
	private String numeroTelefono;
	
	
	public MovilTelecomunicaciones(String marca, String modelo, String imei,String codigoCliente, String numeroTelefono) {
		super(marca,modelo,imei);
		this.codigoCliente = codigoCliente;
		this.numeroTelefono = numeroTelefono;
	}
	public String toString() {
		return super.toString()+"Cliente: "+this.codigoCliente+" Telefono "+this.numeroTelefono;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	public String getNumeroTelefono() {
		return numeroTelefono;
	}


	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	
	
	
	
}
