package Practica7_Ej2;

/*Un punto en el plano se puede representar mediante un par
 * de coordenadas x,y*/

public class Punto_01 {
	public static void main(String[] args) {

		Punto p = new Punto(0, -5);
		
		
		

		System.out.println("Su coordenada ( " + p.getX() + ", " + p.getY() + " ) ");
		
		if(p.getX()== 0 && p.getY()== 0) {
			System.out.println("Esta en el origen");
		}
		if (p.getX()==0) {
			System.out.println("Esta en el eje X ");
		}
		if (p.getY()==0) {
			System.out.println("Esta en el eje Y");
		}
		
		if(p.getX()> 0 && p.getY()>0) {
			System.out.println("Esta en el cuadrante I");
		}
		
		else if (p.getX() <0 && p.getY()>0) {
			System.out.println("Esta en el cuadrante II");
		}
		else if (p.getX()<0 && p.getY()<0) {
			System.out.println("Esta en el cuadrante III");
		}
		else if (p.getX()>0 && p.getY()<0) {
			System.out.println("Esta en el cuadrante VI");
		}
	
			
	}

}

class Punto {
	private double x;
	private double y;

	// Constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// devuelve el cuadrante
	/*public int calcularCuadrante() {
		
		if (x > 0.0 && y > 0.0) {
			return 1;
		} else if (x < 0.0 && y > 0.0) {
			return 2;
		} else if (x < 0.0 && y < 0.0) {
			return 3;
		} else if (x > 0.0 && y < 0.0) {
			return 4;
		} else if(x == 0.0 || y== 0.0){
			return 0;
		}else {
			return -1;
		}
		
		
		
	}*/

	// validar si esta en el eje de coordenadas

}
