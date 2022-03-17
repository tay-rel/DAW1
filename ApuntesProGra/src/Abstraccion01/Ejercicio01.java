package Abstraccion01;

/*Tener una clase abstracta solo sirve para heredar.
 *  De animal no podemos crear objetos ,
 *  pero a prtir de clase perro si 
 *  podemos crear objetos*/

public class Ejercicio01 {
	public static void main(String[] args) {
		
		Perro chucho=new Perro();
		chucho.sonidoAnimal();
		chucho.dormir();
		
		
		
	}

}
//para aplicar la abstraccion se debe aplicar las palabras claves adecuadas .
//NO se puede crear instancias directamente .
abstract class Animal{
	public abstract void sonidoAnimal();//metodo abstracto
	
	public void dormir() {
		System.out.println(".....zzzzZZZZZ");
	}
}
class Perro extends Animal{

	@Override
	public void sonidoAnimal() {//DEbo crear obligatoriamente el sonido Animal.
		// TODO Auto-generated method stub
		System.out.println("El perro hace GUAU GUAU");
	}
	
}
