package practica3;
import java.util.Scanner;

public class Ejercicio13 {
	static double d;
	//variable global 
	//puede acceder a cualquier método
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.print("Ingrese el número de a: ");
			a=entrada.nextDouble();
		System.out.print("Ingrese el nuúmero de b:");
			b=entrada.nextDouble();
		System.out.print("Introduce el numero de c: ");
			c=entrada.nextDouble();
			
			double determinante= Math.pow(b,2)-(4*a*c);
			if(a==0 && b==0) {
				System.out.print("Ecuación degenerada el valor de A no puede ser 0");
				
				return ;
			}
		
			if (determinante>0) {
			
				double x1=(b*(-1) +Math.sqrt(determinante)) / (2*a);
				double x2=(b*(-1) -Math.sqrt(determinante)) / (2*a);
			
			System.out.println("el valor de "+ x1+" y "+ x2);
			System.out.println("El valor del discriminante "+evaluarDiscriminante(a,b,c));
			
		}else if (determinante<0){
			
			System.out.println("La ecuación no tiene solución real");
		}
	}
	
	static double evaluarDiscriminante(double a,double b, double c) {
		
		d=Math.pow(b,2)-(4*a*c);
		if(a==0) {
			return 1;
		}
		
		if(d==0) {
		return 2;
		}else if(d>0) {
				return 3;
				
		}else if(d<0) {
				return 4;
		}
		return d;
	}

}