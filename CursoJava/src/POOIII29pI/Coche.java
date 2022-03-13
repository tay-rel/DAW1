package POOIII29pI;

public class Coche {
	// propiedades encapsuladas
	// Caracteristicas comunes
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	// Caracteristicas que pueden variar
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

//constructor=encargado de dar el estado inicial de Coche
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	// el dato que quiero que me devuelva es un String para que me devuelva una
	// cadena de carateres
	// pero podria valerme un int
	/*
	 * public String dime_largo() {//metodo getter=capta el valor del dato return
	 * "El largo del coche es " + largo +"cm"; }
	 */

	public String dime_datosGenerales() {// metodo getter
		return "La plataforma del vehiculo tiene " + ruedas + "ruedas.\n" + "Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg";
	}

	public void establece_Color(String color_Coche) {// metodo setter=modifica el dato
		// this.largo = largo;
		// color="azul";
		color = color_Coche;// asignamos a color, el parametro color_Coche
	}

	public String dime_Color() {

		return "El color del coche es " + color;
	}

	public void configuraAsientos(String asientos_cuero) {// metodo setter
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dimeAsientos() {// getter
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El asiento no tiene asientos de cuero";
		}
	}

	public void configuraClimatizador(String climatizador) {// metodo setter
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dimeClimatizador() {// metodo getter
		if (climatizador == true) {
			return "El coche incorpora climatizador " + climatizador;
		} else {
			return "El coche lleva aire acondicionado";
		}
	}

	public String dimePeso_coche() {// metodo SETTER Y GUETTER
		int peso_carroceria = 500;
		peso_total = peso_plataforma + peso_carroceria; // establece el valor de la variable SETTER
		if (asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "El peso total del cohe es " + peso_total +" kg";// devuelve(obtiene) un dato GETTER
	}

	public int dimePrecio_coche() {
		int precio_final = 10000;

		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;

		}
		return precio_final;
	}
}
