package PrimerosPasos;import java.util.Scanner;

public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//usamos el metodo refundici�n, convierte un double en int
		int aleatorio=(int)(Math.random()*100);
		
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		int intentos=0;
		
		while(numero!=aleatorio) {
			//me incremente en uno la variable intentos
			intentos++;
			System.out.println("Introduce un numero, porfavor: ");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("M�s bajo");
				
			}else if(aleatorio>numero) {
				System.out.println("M�s alto");
			}
			
			
		}
		System.out.println("CORRECTO.Lo has conseguido en "+intentos+" intentos");
	
		

	}

}
