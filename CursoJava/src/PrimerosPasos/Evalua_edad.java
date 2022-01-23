package PrimerosPasos;import java.util.Scanner;

public class Evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introuce tu edad porfavor: ");
		
		int edad =entrada.nextInt();
		
		if(edad>=18) {
			
			System.out.println("Eres mayor de edad");
			
		}
		else {
			
			System.out.println("Eres menor de edad");
		}

	}

}
