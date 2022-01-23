package PrimerosPasos;import java.util.Scanner;

public class Adivina_numeroDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		/*si el programa llega a dar un num_aleatorio 0
		 * me aseguro que por lo meno se jecute una vez
		 */
		
		do {
			intentos++;
			System.out.println("Introduce un numero, porfavor: ");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Más bajo");
				
			}else if(aleatorio>numero) {
				System.out.println("Más alto");
			}
			
			
		}while(numero!=aleatorio);
		System.out.println("CORRECTO.Lo has conseguido en "+intentos+" intentos");
	
		
		
		
		
		
		
		
	}

}
