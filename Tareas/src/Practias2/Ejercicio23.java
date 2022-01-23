package Practias2;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		
		int a=0;
		int b=1;
		int c=0;
		int n;
		System.out.print("Ingrese cantidad de elementos para la serie: ");
		n=teclado.nextInt();
			
		for(int i=0;i<=(n - 1);i++) {
			if(i > 1) {
				
				c=a+b;
				a=b;
				b=c;
				
				System.out.println(a);
			}
		}
		
		System.out.println(c);
		System.out.println("El elemento de " + n +" es: " + c);
	}

}
