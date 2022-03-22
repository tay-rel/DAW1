package Practica7_Ej2;

public class Segmento_02 {

	public static void main(String[] args) {
		
		SegmentoRecta m= new SegmentoRecta(-5, 3, 6, 2);
		System.out.println("Obten las coordenadas del punto medio del segmento cuyos extremos son los puntos");
		System.out.print("A( "+m.getX0()+", "+m.getX1()+" )");
		System.out.println("  B( "+m.getY0()+", "+m.getY1()+" )  ");
		System.out.println("Xm= "+m.medioX());
		System.out.println("Ym= "+m.medioY());
		System.out.println("M( "+m.medioX()+", "+m.medioY()+" )");
		
		
		
	}

}

class SegmentoRecta{
	//Atributos
	private double x0,x1;
	private double y0,y1;
	
	public SegmentoRecta(double x0, double x1, double y0, double y1) {
		this.x0 = x0;
		this.x1 = x1;
		this.y0 = y0;
		this.y1 = y1;
	}
	//Calculo Xm=((x0+x1)/2)
	public double medioX() {	
		double mX=((this.x0+this.x1)/2);
		return mX;	
	}
	//Calculo Ym=((y0+y1)/2)
	public double medioY() {
		double mY=((this.y0+this.y1)/2);
		return mY;
	}
	//Calcula la distancia entre X y Y
	
/*	public double DistanciaPuntos() {
		double p=Math.sqrt(Math.pow((this.x0-this.x1),2)+Math.pow((this.y0-this.y1),2));
		return p;
	}
	//Calcula double medioTotal
	public double medioTotal() {
		double medioTotal=this.DistanciaPuntos();
		return medioTotal;
	}*/
	
	
	public double getX0() {
		
		return x0;
	}
	public double getX1() {
		return x1;
	}
	public double getY0() {
		return y0;
	}
	public double getY1() {
		return y1;
	}
	
	
}