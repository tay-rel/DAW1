package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int numero,contador=0;
		
		/*System.out.print("Introduzca un numero: ");
		numero=entrada.nextInt();*/
		
		/*do {
		
			if(numero%2==0) {
				System.out.println(" =Este numero es par");
			}else {
				System.out.println(" =Este numero es impar");
			}
			System.out.println("Introduzca un numero: ");
			numero=entrada.nextInt();
		
		 
		}while(numero!=0) ;*/
		
		System.out.print("Introduzca un numero: ");
		numero=entrada.nextInt();
		
		while(numero>=0) {
			
			System.out.print("Introduzca un numero: ");
			numero=entrada.nextInt();
			
			contador ++ ;
			//para mostrar el resultado del contador debe ser fuera del bucle
		}
		System.out.println("El total de numeros introducidos son "+contador);
			
		entrada.close();
	}

}
