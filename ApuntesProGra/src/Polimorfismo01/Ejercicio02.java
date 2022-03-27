package Polimorfismo01;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstrumentoMusical musica=new InstrumentoMusical();
		musica.showI();
		
		Guitarra gui= new Guitarra();
		gui.showI();
		Zamponia za=new Zamponia();
		za.showI();
		Tambor ta=new Tambor();
		ta.showI();

	}

}

class InstrumentoMusical{
	public String tipo;
	public String tamanio;
	public String sonido;
	
	public void showI() {
		System.out.println("¿De que tipo es el instrumento?");
	}
}

class Guitarra{
	public String cuerdas;
	public String tamanio;
	public void showI() {
		System.out.println("Es un instrumento de cuerda");
	}
	
}
class Zamponia{
	public String tamanio;
	public String tubos;
	public void showI() {
		System.out.println("ES un instrumento de viento ");
	}
}
class Tambor{
	public String tipo;
	public String tamanio;
	public void showI() {
		System.out.println("Es un instrumento de percusion");
	}
}
