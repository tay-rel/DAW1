package Polimorfismo01;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstrumentoMusical musica=new InstrumentoMusical();
		musica.showI();
		
		Guitarra gui= new Guitarra();
		gui.showI();
		Zampoña za=new Zampoña();
		za.showI();
		Tambor ta=new Tambor();
		ta.showI();

	}

}

class InstrumentoMusical{
	public String tipo;
	public String tamaño;
	public String sonido;
	
	public void showI() {
		System.out.println("¿De que tipo es el instrumento?");
	}
}

class Guitarra{
	public String cuerdas;
	public String tamaño;
	public void showI() {
		System.out.println("Es un instrumento de cuerda");
	}
	
}
class Zampoña{
	public String tamaño;
	public String tubos;
	public void showI() {
		System.out.println("ES un instrumento de viento ");
	}
}
class Tambor{
	public String tipo;
	public String tamaño;
	public void showI() {
		System.out.println("Es un instrumento de percusion");
	}
}
