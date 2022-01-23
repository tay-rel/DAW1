package Practias2;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner(System.in);
		String operacion= " ";
		int total = 1;
		System.out.println("Calcular el número factorial de: ");
		int e= teclado.nextInt();
		
		if(e<0) {
			System.err.println("Los negativos no son validos");
			System.err.println("Fin de programa");
			return;
		}
		if(e==0) {
			System.out.println("El factorial de 0 es;1");
			return;
		}
		for(int i = 1; i<=e; i++) {
				total *= i;
				
				if(i<e) {
					operacion +=i + " X ";				
				}else {
					operacion +=i+" = ";
				}
			}
			
			System.out.println(e+ "!" + " = " + operacion + total);
			
		
	}

}
