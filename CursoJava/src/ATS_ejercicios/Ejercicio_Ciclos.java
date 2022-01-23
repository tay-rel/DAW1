package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio_Ciclos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada =new Scanner(System.in);
		
		int numero,cuadrado;
		
		System.out.println("Ingre el número,porfavor: ");
		numero=entrada.nextInt();
		
		while(numero>=0) {	//mientras mi numero sea cero o positivo
			
			cuadrado=(int)Math.pow(numero, 2);	//(int) lo transforma a entero
			
			System.out.println("El numero "+ numero+ " elevado al cuadrado es: "+ cuadrado);
			
			System.out.println("Digite otro número, porfavor: ");
			numero=entrada.nextInt();
					
			if(numero<0) {
				System.err.println("Porfavor vuelva a intentarlo.");
				System.out.println("Digite otro número, porfavor: ");
				numero=entrada.nextInt();
				
			}
			}
			
		
		
	}

}
