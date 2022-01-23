package Practica4;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int[] vector = {3, 5, 7, 4, 5, 8, 2};
		 System.out.println(Arrays.toString(vector));
		 
		System.out.print("Escribe el número: ");
		int buscar=entrada.nextInt();
		
		System.out.println(buscarInt(vector,buscar));
		entrada.close();
	}

	static String buscarInt(int[] vector,int buscar) {
	
		for (int i = 0; i < vector.length; i++) {
			if(vector[i]== buscar){
				
				return "Esta en la posicion:  " + i;//retorno la posicion del primero 
			}
		}

		return "El número no existe en el array";


	}

}
