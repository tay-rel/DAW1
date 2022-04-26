package Practica8_Bolque2_Ejercicio06;

public class Main {

	public static void main(String[] args) {
		/*
		 * Depositos deposito = new Depositos("Alfredo", "Particular", 1000);
		 * System.out.println("Deposito\n" + deposito.tipoInteresMensual(2, 4.5));
		 * deposito.depositar(); deposito.retirar(); Credito credito = new
		 * Credito("Pablo", "Empresas", 2000); System.out.println("Credito\n" +
		 * credito.tipoInteresMensual(4, 5000)); credito.depositar(); credito.retirar();
		 */

	}
}

class Depositos extends Cuenta implements Interface {

	public Depositos(String nombre, String tipoCliente, double saldo) {
		super(nombre, tipoCliente, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar() {
		System.out.println("¿Cuanto deseas depositar?");
	}

	@Override
	public void retirar() {
		System.out.println("¿Cuanto deseas retirar?");

	}

	@Override
	public double tipoInteresMensual(int numeroMeses, double tipoInteres) {
		if (super.getSaldo() >= 1000) {
			return numeroMeses * tipoInteres;
		} else {
			return 0;
		}

	}

}

class Credito extends Cuenta implements Interface {

	public Credito(String nombre, String tipoCliente, double saldo) {
		super(nombre, tipoCliente, saldo);
	}

	@Override
	public void depositar() {
		System.out.println("¿Cuanto deseas depositar?");

	}

	@Override
	public void retirar() {
		System.out.println("Lo siento, usted no puede retirar con su cuenta de Credito");

	}

	@Override
	public double tipoInteresMensual(int numeroMeses, double tipoInteres) {
		String particular = "Particular";
		String empresas = "Empresas";
		if (super.getTipoCliente().equalsIgnoreCase(particular)) {
			numeroMeses = 3;
			return numeroMeses * tipoInteres;
		} else if (super.getNombre().equalsIgnoreCase(empresas)) {
			numeroMeses = 12;
			return numeroMeses * tipoInteres;
		}
		return 0;
	}
}

class Hipotecas extends Cuenta implements Interface {

	public Hipotecas(String nombre, String tipoCliente, double saldo) {
		super(nombre, tipoCliente, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void depositar() {
		System.out.println("¿Cuanto deseas depositar?");

	}

	@Override
	public void retirar() {
		System.out.println("Lo siento, usted no puede retirar con su cuenta de Hipoteca");

	}

	@Override
	public double tipoInteresMensual(int numeroMeses, double tipoInteres) {
		String particular = "Particular";
		String empresas = "Empresas";
		if (super.getTipoCliente() == particular) {
			numeroMeses = 6;
			return numeroMeses * tipoInteres;
		} else if (super.getNombre() == empresas) {
			numeroMeses = 12;
			return numeroMeses * tipoInteres;
		}
		return 0;
	}
}
