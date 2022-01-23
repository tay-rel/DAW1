package ATS_ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays47 {

	public static void main(String[] args) {
		
		Scanner entry=new Scanner(System.in);
		int[] vector=new int [10];
		boolean creciente=false,decreciente=false;
		
		System.out.println("Porfavor introduzca los numeros ");
		
		for(int i=0;i<10;i++) {//pedimos 10 elememtos
			System.out.print((i+1)+"- Digite el numero: ");
			vector[i]=entry.nextInt();	
		}
			
		for(int i=0;i<9;i++) {
			if(vector[i]<vector[i+1]) {//creciente 1 2 3 4
				creciente=true;
			}
			if(vector[i]>vector[i+1]) {//decreciente 4 3 2 1
				decreciente=true;
			}
		}
		
		if(creciente== true&& decreciente ==false) {
			System.out.println(Arrays.toString(vector));
			System.out.println("\n El arreglo esta de forma creciente");
		}
		else if (creciente==false && decreciente==true){
			System.out.println(Arrays.toString(vector));
			System.out.println("\n El arreglo es de forma decreciente");
		}
		else if(creciente==true && decreciente ==true) {
			System.out.println(Arrays.toString(vector));
			System.out.println("\n El arreglo esta desordenado");	
		}
		else if(creciente==false && decreciente== false) {
			System.out.println(Arrays.toString(vector));
			System.out.println("\nTodos los numeros son iguales");
		}
		
	}

}
