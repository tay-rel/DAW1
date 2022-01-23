package ATS_ejercicios;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entry=new Scanner(System.in);
		int[] arreglo=new int [10];
		int ultimo;
		
		System.out.println("Llena el arreglo");
		for(int i=0;i<10;i++) {
			System.out.print((i)+" Digite un numero: ");
			arreglo[i]=entry.nextInt();
		}
		System.out.println(Arrays.toString(arreglo));

		ultimo=arreglo[9];
		
		for(int i=8;i>=0;i--) {
			arreglo[i+1]=arreglo[i];
		}
		arreglo[0]=ultimo;
		
		System.out.println("El nuevo array es:");
		for(int i=0;i<10;i++) {
		
		}
		System.out.println(Arrays.toString(arreglo));
		
		
	}

}
