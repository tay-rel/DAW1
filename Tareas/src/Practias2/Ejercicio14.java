package Practias2;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);
		
		 int numerador=0; 
		 int total = 0;
		 int denominador = 0;
		do {
			 System.out.print("Introduce un numero positivo: ");
			 total = teclado.nextInt();
			if(total>0) {	//positivos
				denominador ++;
				numerador +=total;
			}else if(total<0) {
				System.out.println("Los negativos no son validos");
			}
			
		}while(total!=0);
		
		System.out.println("El total sumado es: " + numerador);
		
		if(denominador>0) {
		System.out.println("La media es: " + numerador/denominador); 
		
		}else {
			System.out.println("La media aritmetica es: 0 ");
		}
		teclado.close();
	}
	
}
