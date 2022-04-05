package Practica7_Ej2;

public class MovilTienda extends movil {
	private double pvp;
	private String estado;

	public MovilTienda(String marca, String modelo, String imei,double pvp,String estado) {
		super(marca, modelo, imei);
		this.setPvp(pvp >= 0 ? pvp : 0);
		this.estado = estado;
		

	}
	
	public String toString() {
		return super.toString()+" "+this.pvp+" € "+this.estado;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp =  pvp >= 0 ? pvp : 0; //se fuerza a que el valor no sea negativo
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
