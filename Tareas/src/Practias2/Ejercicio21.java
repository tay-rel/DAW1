package Practias2;
import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if y else//bucle
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Introduzca un X: ");
		int x=entrada.nextInt();
		System.out.println("Introduzca un Y: ");
		int y=entrada.nextInt();
		System.out.println("Introduzca un Z: ");
		int z=entrada.nextInt();
		String continuar="S";
		
	while(continuar.trim().equalsIgnoreCase("S") ){
		
		if((x+y)<=z || y+z <= x || x+z <= y) {
			
			System.err.println("Los datos introducidos son incorrectos");
			
		}
			
			if ( (x+y)>z && (y+z)>x ) {
				
				
				if(x==y && x==z) {
					
					System.out.println("El triángulo es un Equilatero ");
					
					}
				
					else if(x==y || x==z || y==z) {
					System.out.println("El triángulo es un Isóceles ");
					
					}else {
						
					System.out.println("El triangulo es un Escaleno ");
				}
					
			}
		
			System.out.println("Quieres terminar el programa.Preciona \"s\" si quieres continuar:" );
			continuar=entrada.nextLine();
	}		
	
	}

}
