package ATS_ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays48b {

	
	public static void main(String[] args) {
		
		Scanner entry=new Scanner(System.in);
		
		int[] vector=new int[10];
		int number,position,last;
		
		System.out.println("\t---Porfavor ingrese los numeros---");
		for(int i=0;i<vector.length;i++) {
			System.out.print((i+1)+". Digite un numero: ");
			vector[i]=entry.nextInt();	
		}
		System.out.println(Arrays.toString(vector));
		
		System.out.println("Ingrese el valor que quiere desplazar: ");
		number=entry.nextInt();
		
		for(int i=0;i<number;i++) {
			last=vector[9];
			for(int j=8;j>=0;j--) {
				vector[j+1]=vector[j];
			}
			vector[0]=last;
		}
		
		System.out.println("Resultado: ");
		for(int i=0;i<10;i++) {
			if(i==9) {
				System.out.println(vector[i]);
			}else {
				System.out.print(vector[i]+"-");
			}
		}
		
	}

}
