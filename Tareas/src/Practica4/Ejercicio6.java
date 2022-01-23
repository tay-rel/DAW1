package Practica4;
import java.util.Arrays;

public class Ejercicio6 {
	
	static int[] vector= {3, 5, 1, 4, 5, 5, 4, 1, 2, 3, 4, 5, 6,7}; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print("Este es el vector: ");
		
		for(int i=0; i<vector.length;i++) {
			
		}
		System.out.println(Arrays.toString(vector));
		
		System.out.println("La secuencia mayor es de "+contarIntConsecutivos(vector)+" numeros");
		
		
	}
	static int contarIntConsecutivos(int[] vector) {
		int contador=0;
		int maximo=0;
		
		for(int i =1;i<vector.length;i++) {
			
			if((vector[i-1])==vector[i]-1) {//resta al elemento para compararlo con el anterior
				contador++;
			}else  {
			
				contador=0;
			}
			if (contador>maximo) {
				maximo=contador;
			}
		}

		return maximo > 0 ? maximo + 1: maximo;
		
		
	}

}
