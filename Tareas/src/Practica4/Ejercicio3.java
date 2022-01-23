
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	static int[] originales =new int [10];
	static int[] frecuencia =new int [10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i=0; i<originales.length;i++) {
			originales[i]= (int) (Math.random()*10);//se le da 1 para no tener el cero como numero aleatorio
		}
		System.out.println(Arrays.toString(originales));
		
		System.out.println(frecuenciaNumero(originales));
	}
		
		static String frecuenciaNumero(int[]enteros) {
			
			int[] frecuencia =new int [10];
			
			for(int i=0;i<enteros.length;i++) { //recorre la posicion
				frecuencia[enteros[i]]+=1; 	//cuenta numeros repetidos
			}
			
			
			return Arrays.toString(frecuencia);
		
		
	}

}
