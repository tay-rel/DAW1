package ATS_ejercicios;
import java.util.Scanner;

public class Array44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	float[] numeros=new float[5]; //reservamos 5 espacios al Array
	

	System.out.println("Guardando los datos del arreglo: ");
	
	mostrarArrays(numeros);
	
	System.out.println("Imprimir todos los elementos");
	for(float i:numeros) {
		System.out.println(i);
		
		}

	
	
	}
	static void mostrarArrays(float[] numeros) {
		Scanner entrada=new Scanner(System.in);
		
		
		for(int i=0;i<numeros.length;i++ ) {
			System.out.print((i+1)+" Digite un numero: ");
			numeros[i]=entrada.nextFloat();	
			
		}
	}

}
