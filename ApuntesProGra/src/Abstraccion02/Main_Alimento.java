package Abstraccion02;

public class Main_Alimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tomate cherry=new Tomate(40, 29, 0, 3, 1, "cherry", "rojo");
		System.out.println("El tomate: "+cherry);
		cherry.setPeso(-100);
		System.out.println("El tomate: "+cherry);
		cherry.setPeso(500);
		System.out.println("El tomate: "+cherry);
		
		Jamon serrano= new Jamon(8000, 40, 2, 40, 100, "serrano");
		System.out.println("Jamón: "+serrano);
	}

}
