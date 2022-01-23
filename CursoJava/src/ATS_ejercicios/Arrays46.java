package ATS_ejercicios;
import java.util.Scanner;

public class Arrays46 {
	//* Leer por teclado tablas de 10 numeros
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		
		int a[],b[],c[];
		a= new int[10]; //arreglo a con 10 elementos
		b= new int[10]; //arreglo b con 10 elementos
		c= new int[20]; //arreglo c tendra los elementos de a y b
		
		//pedir el arreglo a 
		System.out.println(" Digite el primer arreglo");
		
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+" Digite un numero: ");
			a[i]=entrada.nextInt();
		}
		//pedir el arreglo b
		System.out.println("\nDigite el segundo arreglo");
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+" Digite un numero: ");
			b[i]=entrada.nextInt();
		}
		
		//ahora mezclar los dos arreglos en "c"
		//vamos a utilizr el iterador i para a y b 
		//y el iterador j para el c 
		int j=0;
		for(int i=0;i<10;i++) {
			c[j]=a[i]; //1ºA
			j++;
			c[j]=b[i]; //1ºB
			j++;
		}
		
		System.out.print("\nEl tercer arreglos es: ");
		for(int i=0;i<20;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
	}

}
