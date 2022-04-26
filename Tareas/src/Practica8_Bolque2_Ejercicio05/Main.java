package Practica8_Bolque2_Ejercicio05;

public class Main {
	public static void main(String[] args) {

		Perro cerverus = new Perro("Cerverus", "Macho", 2);
		System.out.println(cerverus.toString());
		cerverus.sonidoCaracteristico();
		Gato miguel = new Gato("Miguel", "Macho", 10);
		System.out.println(miguel.toString());
		miguel.sonidoCaracteristico();
		gatito manchas = new gatito("Manchitas", "Hembra", 5);
		System.out.println(manchas.toString());
		manchas.sonidoCaracteristico();
		Rana rene = new Rana("Rene", "Macho", 20);
		System.out.println(rene.toString());
		rene.sonidoCaracteristico();
		Tigre scar = new Tigre("Scar", "Macho", 30);
		System.out.println(scar.toString());
		scar.sonidoCaracteristico();

	}

}

class Perro extends Animal {
	public Perro(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
	}

	@Override
	public void sonidoCaracteristico() {
		System.out.println("Guau guau guau");

	}

}

class Rana extends Animal {

	public Rana(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
	}

	@Override
	public void sonidoCaracteristico() {
		System.out.println("Croac croac croac");
	}

}

class Gato extends Animal {

	public Gato(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
	}

	@Override
	public void sonidoCaracteristico() {
		System.out.println("Miau miau miau");

	}

}

class gatito extends Animal {

	public gatito(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Nombre: " + super.getNombre() + "Sexo:" + super.getSexo() + " Edad: " + super.getEdad() + " meses";
	}

	@Override
	public void sonidoCaracteristico() {
		System.out.println("miay miau miau");

	}

}

class Tigre extends Animal {

	public Tigre(String nombre, String sexo, int edad) {
		super(nombre, sexo, edad);

	}

	@Override
	public void sonidoCaracteristico() {
		System.out.println("El tigre ruge!!!");

	}

}