package Teoria1;
import java.util.Scanner;

public class Ejemplo23_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		int x=0,y=1,suma=0,posicion;
		
		System.out.print("Introduce la posición que quieres calcular en la sucecion: ");
		posicion=entrada.nextInt();
		
		for(int i =0; i<=posicion;i++) {
		
			if(i>1){
				
				suma=x+y;
				x=y;
				y=suma;
				
		
			}		
		}
		System.out.println(suma);
		System.out.println("La posicion de "+posicion+" es: "+ suma);
	}

}
