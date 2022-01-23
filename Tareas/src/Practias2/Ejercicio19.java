package Practias2;
import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		double a;
		double b;
		double c;
		
		System.out.println("Ingrese el número de a: ");
			a=entrada.nextDouble();
		System.out.println("Ingrese el nuúmero de b:");
			b=entrada.nextDouble();
		System.out.println("Introduce el numero de c: ");
			c=entrada.nextDouble();
			
			double determinante= Math.pow(b,2)-(4*a*c);
			if(a==0 && b==0) {
				System.out.println("Ecuación degenerada el valor de A no puede ser 0");
				return;
			}
		
		if (determinante>0) {
			
			double x1=(b*(-1) +Math.sqrt(determinante)) / (2*a);
			double x2=(b*(-1) -Math.sqrt(determinante)) / (2*a);
			
			System.out.println("El valor de x1= "+x1+"\nEl valor de x2: "+x2);
			
		}else if (determinante<0){
			
			System.out.println("La ecuación no tiene solución real");
		}
	}

}
