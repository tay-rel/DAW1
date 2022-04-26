package Practica7_Ej2;

public class Carta_05 {
	private String direccion;
	private String destinatario;

	public Carta_05(String direccion, String destinatario) {
		this.direccion = direccion;
		this.destinatario = destinatario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		if (direccion != null) {
			this.direccion = direccion;
		}

	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		if (destinatario != null) {
			this.destinatario = destinatario;
		}

	}

}
