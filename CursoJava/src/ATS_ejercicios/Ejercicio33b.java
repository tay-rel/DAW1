package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio33b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int numero,contador=0;
		System.out.println("Introduce un numero: ");
		numero=entrada.nextInt();
		
		while(numero!=0) {
			System.out.println("Introduce un numero: ");
			numero=entrada.nextInt();
			contador++;
		}
		System.out.println("El numero total de numeros introducidos son: "+contador);
	
		entrada.close();
	}

}
