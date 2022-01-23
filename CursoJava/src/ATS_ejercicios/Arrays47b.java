package ATS_ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays47b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry=new Scanner(System.in);
		
		int[] vector=new int[10];
		int numero,posicion;
		
		System.out.println("Introduzca los numeros porfavor\n");
		for(int i=0;i<8;i++) {
			System.out.print((i+1)+"Digite un numero: ");
			vector[i]=entry.nextInt();
		}
		System.out.println(Arrays.toString(vector));
		
		System.out.print("\nDigite un numero: ");
		numero=entry.nextInt();
		System.out.print("\n Digite una posicion: ");
		posicion=entry.nextInt();
		
		
		//posicion=posicion-1;
		
		for(int i=8;i>=posicion;i--) {
			vector[i+1]=vector[i];
		}
		vector[posicion]=numero;
		for(int i:vector) {
			System.out.print(i);
		}
		System.out.println(Arrays.toString(vector));
	}

}
