package Encapsulacion;

public class Ejemplo1 {
	public static void main(String[] args) {
		
		Coordenada coor=new Coordenada();
		coor.x=5.26;
		coor.y=3.99;
		System.out.println("Cordenada: "+coor.x+", "+coor.y);
		
	}

}



//Nueva clase
class Coordenada{
	//Aqui no hay encapsulacion
	public  double x;
	public  double y;
}
