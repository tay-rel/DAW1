import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] elementos=new int [20];
	
		
		for (int i=0; i<elementos.length;i++) {
			elementos[i]=i*5;		//Asigna el valor a cada elemento
		
		}
		
		System.out.println(Arrays.toString(elementos));		//muestra el array y su recorrido 
		
	}

}
