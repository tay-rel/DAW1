package Abstraccion01;

public class HerenciaMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frankenstein monstruo=new Frankenstein();
		monstruo.hablar();
		monstruo.andar();
		monstruo.saltar();
		monstruo.sonidoAnimal();
		monstruo.dormir();
		
		
	}

}

class Frankenstein extends Animal implements Persona{
	public void sonidoAnimal() {
		System.out.println("Uuuurrrrggggh urrggghh");
	}
	
	public void hablar() {
		System.out.println("Monstruo hablar como persona");
	}
	public void saltar() {
		System.out.println("Monstruo no salta como persona. ");
		this.sonidoAnimal();
	}
	public void andar() {
		System.out.println("Monstruo andar como persona normal");
	}
}
