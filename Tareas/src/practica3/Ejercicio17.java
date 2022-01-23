package practica3;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		muestraCuadrado();
		
		
		
	}
	static void muestraCuadrado() {
		Scanner teclado=new Scanner(System.in);
		String caracter="";
		System.out.print("Introduce el caracter,porfavor: ");
		caracter=teclado.next();
		
		System.out.print("Escribe el número: ");
		int n =teclado.nextInt();
		
		if(n >=0 && n<=50) {
			//linea superior
			for(int i = 0; i < n; i++) {
				System.out.print( caracter);
				
			}
			System.out.println();
			
			//centro de la forma
			for(int i = 0; i < n-2; i++ ) {
				
				System.out.print(caracter);
				
				for(int j=0; j < n-2; j++) {
					System.out.print(" ");
					
				}
				System.out.println(" "+caracter);
			}
			
			//linea inferior
			for(int i = 0; i < n; i++) {
				System.out.print(caracter);
			}	
			
		}
			
		
	}

}
