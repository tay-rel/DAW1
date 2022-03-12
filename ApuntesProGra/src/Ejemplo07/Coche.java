package Ejemplo07;

public class Coche {
	
	String propietario;
	String marca;
	String modelo;
	String color;
	int km;
	
	public String informacion() {
		String info=marca +" "+modelo+" "+color+" "+km+ " (" + propietario + ") ";
		return info;
	}

}
