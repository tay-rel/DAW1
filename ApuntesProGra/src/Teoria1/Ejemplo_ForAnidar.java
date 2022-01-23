package Teoria1;
/*BUCLE FOR*/

public class Ejemplo_ForAnidar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,operacion;
		
		for(i=1; i<=10; i++) {
			System.out.println("Tabla del  " + i + ";");
			System.out.println("");
			
			for(j = 1; j<=10; j++) {
				operacion= i * j;
				System.out.println(i + " X " + j + " = " + operacion);
			}
				System.out.println("");
			
		}
			System.out.println("Fin. ");
		}
		
		
		
	}


