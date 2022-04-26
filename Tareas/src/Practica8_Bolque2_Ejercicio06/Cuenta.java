package Practica8_Bolque2_Ejercicio06;

abstract class Cuenta {
	private String nombre;
	private String tipoCliente;
	private double saldo;

	public Cuenta(String nombre, String tipoCliente, double saldo) {
		this.nombre = nombre;
		this.tipoCliente = tipoCliente;
		this.saldo = saldo;
	}

	public String toString() {
		return "Nombre: " + this.nombre + "Tipo de cliente: " + this.tipoCliente + "Saldo: " + this.saldo + " €";
	}

	public abstract double tipoInteresMensual(int numeroMeses, double tipoInteres);

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
		String particular="Particular";String empresas="Empresas";
		if (tipoCliente.equalsIgnoreCase(particular)) {
			tipoCliente=particular;
		}else if(tipoCliente.equalsIgnoreCase(empresas)) {
			tipoCliente=empresas;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
