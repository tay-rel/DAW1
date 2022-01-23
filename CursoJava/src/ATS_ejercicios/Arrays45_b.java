package ATS_ejercicios;
import java.util.Scanner;

//alternanr posiciones array
public class Arrays45_b {
	static int[] numeros=new int[10];
	static int contador_num=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		 System.out.println("Guardar Arreglos ");
		 
	
		 
		 for(int i=0; i < numeros.length;i++) {
			 System.out.print((i+1)+": Introduce un numero: ");
			 numeros[i]=entrada.nextInt();
		 }
		
		 
		 System.out.println("Array alternado es : ");
		 for(int i=0;i<numeros.length/2;i++) {
			 System.out.println(numeros[i]);
			 System.out.println(numeros[numeros.length-1-i]);//lo mismo que numero[9-i]
		 }
		 
	}

}
