package Abstraccion01;

/*Una interface es una clase puramente abstracta*/

public class Interface01 {
	public static void main(String[] args) {
		
		Adulto a=new Adulto();
		a.hablar();
		a.andar();
		a.saltar();
		
		Bebe b=new Bebe();
		b.andar();
		b.saltar();
		b.hablar();
		
		
		
	}
}

/*Con esto restringimos el codigo*/
interface Persona{
	public void hablar();
	public void andar();
	public void saltar();
	
}
class Adulto implements Persona{
	private int saltos;
	public void hablar() {
		System.out.println("Estoy hablando contigo");
	}
	public void andar() {
		boolean andando=true;
		System.out.println("(Andando)"+andando);
	}
	public void saltar() {
		this.saltos++;
		System.out.println("(Ha saltado): "+ this.saltos);
	}
}
class Bebe implements Persona{
	public void hablar() {
		System.out.println("guauauu");
	}
	public void andar() {
		boolean andando=false;
		System.out.println("El bebe no anda , gatea.");
	}
	public void saltar() {
		System.out.println("No puede saltar.Como mucho rebota");
	}
}