package Teoria1;
import java.util.Scanner;

public class Ejemplo18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner(System.in);
		String operacion= "";
		int total=1;
		System.out.println("Introduce un número positivo: ");
		int num=entrada.nextInt();
		
		if(num<0) {
			System.err.println("Los negativos no son validos");
			System.err.println("Fin de programa");
			return;
		}
		if(num==0) {
			System.out.println("El factorial de 0 es;1");
			return;
		}
		for (int i=1;i<=num; i++) {	
			total=total * i;
			
			if(i<num) {
				operacion += i + "x";
			}else {
				operacion +=i+"=";
			}
			
		}
		System.out.println("\nFactorial:\n\n" + operacion + total);
	}

}
