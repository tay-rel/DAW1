package Practica7_Ej2;

public class Movil {

	public static void main(String[] args) {

		movil samsung = new movil("SAMSUNG", "Galaxy f4 ", "364537645837 ");
		System.out.println("Marca movil: " + samsung.getMarca());
		System.out.println("Informacion completa: " + samsung);
		
		MovilTienda xioami =new MovilTienda("XIOAMI", "Redmi", "3753745", 332.545, "Nuevo ");
		
		System.out.println("Movil Tienda: "+xioami);
		
		
		MovilTelecomunicaciones lg=new MovilTelecomunicaciones("LG", "Mg15", "65173518", "7264726345", "+345789541");
		System.out.println("Movil telecomunicaiones: "+lg);

		
		
	}
}

	class movil {

		private String marca;
		private String modelo;
		private String imei;

		public movil(String marca, String modelo, String imei) {
			this.marca = marca;
			this.modelo = modelo;
			this.imei = imei;
		}

		public String toString() {
			String info = this.marca + " " + this.modelo + " " + this.imei;
			return info;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public String getImei() {
			return imei;
		}

		public void setImei(String imei) {
			this.imei = imei;
		}
	}


