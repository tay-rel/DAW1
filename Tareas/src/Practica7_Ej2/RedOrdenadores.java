package Practica7_Ej2;

public class RedOrdenadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ordenador o=new Ordenador("Lenovo", "Yoga", "Gris", 203.61);
		
		
		
	}

}


class Ordenadores extends Ordenador{
	
	private String ip;

	public Ordenadores(String modelo, String marca, String cpu, double precio, String ip) {
		super(modelo, marca, cpu, precio);
		this.ip=ip;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	
}