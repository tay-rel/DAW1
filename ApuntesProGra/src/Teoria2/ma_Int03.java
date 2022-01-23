package Teoria2;
import java.util.Scanner;

public class ma_Int03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Indica la cantidad de numeros que quieres indicar:  ");
		int [] numeros =pedirNumeros();

		System.out.print("Números sin ordenar: ");
		mostrarArrays(numeros);

		System.out.print("NUmeros ordenados: ");
		mostrarArrays(ordenarNumeros(numeros));
		
	}
	static int [] pedirNumeros() {
	Scanner teclado=new Scanner(System.in);
	int[] numeros =new int[5];
	
	for(int i=0; i<numeros.length-1;i++) {
		System.out.print("Introduce el "+(i+1)+"º numero: ");
		numeros[i]=teclado.nextInt();
		}
		return numeros;	
		
		
	}
	static void mostrarArrays(int [] numeros) {
		String serie="";
		
		for(int i=0; i<numeros.length; i++) { //la propiedad length indica la cantidad
			serie +=numeros[i];
			if(i<numeros.length-1) {serie +=",";}
			
		}
		System.out.println(serie);
		
	}
	
	

	static int[] ordenarNumeros(int [] numeros) {
		int aux;
		
		for(int i=0;i<numeros.length;i++) {
			for(int j=0;j<numeros.length;j++) {
				
				if(numeros[i]<numeros[j]) {//menor a mayor
					aux=numeros[j];
					numeros[j]=numeros[i];
					numeros[i]=aux;
				}
			}
		}
		
		return numeros;

			}
	}
