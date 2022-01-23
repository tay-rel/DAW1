package practica3;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calcularMostrarTabla();
		
	}
	static void calcularMostrarTabla() {	
		
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.print("Introduce un número: "); 
		num=entrada.nextInt();

		for(int i=0;i<15;i++) {
		
			//int resultado= num+" x "+i+" = "+num*i;
			System.out.println(num+" x "+i+" = "+num*i);
		}
		
		
		entrada.close();
	}

}
