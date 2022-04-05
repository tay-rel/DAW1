package Abstraccion02;

public class SmartTv extends TV {
	private boolean internet;

	public SmartTv(String marca, String modelo, int pulgadas) {
		super(marca, modelo, pulgadas);
		this.internet = false;
	}

	public boolean hasInternet() {
		return internet;
	}

	public void setInternet(boolean internet) {
		this.internet = internet;
	}

	public void conectarInternet() {
		if (super.isEncendida()) {
			if (!this.internet) {
				this.internet=true;
				System.out.println("Conectado a INTERNET");
			} else {
				System.out.println("Ya esta conectado a Internet");
			}
		} else {
			System.out.println("Debe estar encendida para conectar/desconectar de Internet");
		}
	}
	public void desconectarInternet() {
		if (super.isEncendida()) {
			if (this.internet) {
				this.internet=false;
				System.out.println("Desconectado a INTERNET");
			} else {
				System.out.println("Ya esta conectado a Internet");
			}
		} else {
			System.out.println("Debe estar encendida para conectar/desconectar de Internet");
		}
	}
	// Funcionalidad polimorfismo
		public void cambioCanal(int canalID) {
			if (this.internet) {
				super.cambiarCanal(canalID); 
				System.out.println("Canal cambiado a " + canalID);
			}else {
				System.out.println("se necesita conexion a internet para cambiar canal");
			}
		}

}
