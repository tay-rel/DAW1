package practica3;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Introduzca un X: ");
		int a=entrada.nextInt();
		System.out.print("Introduzca un Y: ");
		int b=entrada.nextInt();
		System.out.print("Introduzca un Z: ");
		int c=entrada.nextInt();
		
		esTriangulo(a,b,c);
		if(esTriangulo(a,b,c)==false) {
			System.err.println("error");
		}else {
			System.out.println(tipoTriangulo(a,b,c));
		}
		
		entrada.close();
		
	}
	
	static boolean esTriangulo(double a, double b, double c) {
		
		if(a<=0 || b<=0 || c<=0) {
			return false;
		}
		if((a+b) <= c|| (a+c) <= b || (b+c) <=a) {
			return false;
		}
		return true;
		
	
			
	}static String tipoTriangulo(double a, double b, double c) {
		
		String tipo="error";
		

			
			if(a==b && b==c) {
				tipo ="Es un equilatero";
			}
			if(a==b && c!=b){
				tipo ="Es un Isoceles";
			}
			if(a!=b && a!=c && b!=c) {
				tipo="Es un escaleno";
			}
		return tipo;
		
	}

}
