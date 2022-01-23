package Practica4;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
	static int[] vector1={1,2,3,4,5,6};
	static int[] vector2= {1,2,3,4,5,6};
	
	public static void main(String[] args) {
			System.out.println(Arrays.toString(vector1));
			System.out.println(Arrays.toString(vector2));
			
		System.out.println(vectoresIguales(vector1,vector2));
	
	}
	
	static boolean vectoresIguales(int[]vector1, int[]vector2) {
		
		if(vector1.length==vector2.length) {
			
			for (int i=0; i <vector1.length;i++) {	
				if(vector1[i]!=vector2[i]) {
					return false;
				}
			}
		}else{
			return false;
		}
		
		return true;
	
	}

}
