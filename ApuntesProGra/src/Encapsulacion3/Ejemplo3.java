package Encapsulacion3;



public class Ejemplo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reescribi el construtor
		Coordenada coor=new Coordenada(2,3.64);
		//En java usamos los setters y getters, para cada propiedad que es privada
		
		//muestra valor que le asignamos en el constructor 
		
		System.out.println("Cordenada: "+coor.getX()+", "+coor.getY());
		
		
		//llamamaos a metodos setter
		coor.setX(5.26);
		coor.setY(3.99);
		//llamamao metodo getter
		System.out.println("Cordenada: "+coor.getX()+", "+coor.getY());
		
		Coordenada coord2= new Coordenada(8,16,true);
		System.out.println("Cordenada2: "+coor.getX()+", "+coor.getY());
		
	}

}



//Nueva clase
class Coordenada{
	//Aqui hay encapsulacion
	private  double x;
	private  double y;
	
	//Constructor sin parametros 
	public Coordenada() {
		//this.x=5; this.y=5;
	}
	//Constructor con parametrod
	public Coordenada(double x,double y) {
		this.x=x;
		this.y=y;
	}
	//Contructor con tre parametros 
	public Coordenada(double x,double y,boolean check) {
		//SI el check es true ,valores maximos 10
		if (check&& x >10) {
			this.x=10;
			
		} else {
			this.x=x;
		}
		
		if (check&& x >10) {
			this.y=10;
			
		} else {
			this.y=y;
		}
	}
	
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