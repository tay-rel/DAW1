package Polimorfismo01;

public class Ejercicio01 {
	public static void main(String[] args) {
		
		Animal cosa=new Animal();
		cosa.sonidoAnimal();
		
		Perro chucho=new Perro();
		chucho.sonidoAnimal();
		
		Gato cat=new Gato();//Instanceamos la clase
		cat.sonidoAnimal();
		
		
		
	}
	
}

class Animal{
	public int patas;
	public int ojos;
	public void sonidoAnimal() {
		System.out.println("El animal hace un sonido");
	}
}

class Perro extends Animal{
	public String color;
	//Se reescribe el metodo hace otra cosa
	public void sonidoAnimal() {
		System.out.println("El perro hace GUAU GUAU");
	}
	
}

class Gato extends Animal{
	public String unias;
	public void sonidoAnimal() {
		System.out.println("El gato hace MIAU MIAU");
	}
}