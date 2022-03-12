package Encapsulacion2;



public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coordenada coor=new Coordenada();
		//En java usamos los setters y getters, para cada propiedad que es privada
		
		//llamamaos a metodos setter
		coor.setX(5.26);
		coor.setY(3.99);
		//llamamao metodo getter
		System.out.println("Cordenada: "+coor.getX()+", "+coor.getY());
		
	}

}



//Nueva clase
class Coordenada{
	//Aqui hay encapsulacion
	private  double x;
	private  double y;
	
	//ACOMPAÑADO DEL NOMBRE DE LA PROPIEDAD
	//setters
	public void setX(double x) {
		//se pone this para asignar el valor del atributo de la clase
		//se puede usar tambien x=newx;
		
		this.x=x;
	}
	public void setY(double y) {
		this.y=y;
	}
	
	//getters
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
}