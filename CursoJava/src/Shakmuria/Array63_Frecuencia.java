
package Shakmuria;import java.util.Arrays;
import java.util.Scanner;

public class Array63_Frecuencia {

   static int [] array={2,2,1,4,4,5,5,3};
    static int[] frecuencia =new int[7];
		public static void main(String[] args) {
		        
			
		        
			//int[] frecuencia=new int [11];//mi contador para la frecuencia
			for(int i=0; i<array.length;i++) {//propiedad length muestra el tamaño del arreglo
				frecuencia[array[i]]+=1;
			}//imprimir los valores
			
			System.out.println(Arrays.toString(array));
			
			
			
			for(int j=0;j < frecuencia.length;j++ ) {
				//System.out.println("Arrays "+j+": "+frecuencia[j]+" veces");
			}
			System.out.println(Arrays.toString(frecuencia));
			
		
			
		
	}	
		
}
