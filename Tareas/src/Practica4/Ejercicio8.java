package Practica4;
import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] enteros= {1,2,3,4,5,6,7,8,9,10};
		//int[] enteros= {2,7,8,5,6,2,4,1,5,7,10};
		System.out.println(Arrays.toString(enteros));
		
		
		System.out.println(yaOrdenadoInt(enteros));
		
		
		
	}
	static boolean yaOrdenadoInt(int[] enteros) {
		
		for (int i=0; i<enteros.length-1;i++) {
			if(enteros[i]>enteros[i+1]) {
				return false;
			}
			
		}
		
		return true; 
	
		
		
	}

}
