package Practias2;


import java.util.Scanner;

public class Ejerccio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		int num;
		
		System.out.println("Ingresa un número, porfavor: ");
		num=entrada.nextInt();
		
		System.out.println("1");
		
		for(int i=1; i<num ;i++) {
			int contador=0;
			
			for(int j=1;j<=i;j++) {
			
				if(i%j==0) {
					contador++;	//contador=contador+1
				}
				if(contador > 2) {
					break;
				}
				
			}	
			
			if(contador==2) {
				System.out.println(i);
			}
		}
	
	}
}
