package PrimerosPasos;import java.util.Scanner;

public class Entrada_Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, porfavor");
		//debo usar el objeto que pertenece a la clases Scanner
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, porfavor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + " El a�o que viene tendr�s " + (edad+1) + " a�os ");

	}

}
