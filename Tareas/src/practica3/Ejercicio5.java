package practica3;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		//int num;
		String continuar="";
		
		do {
		System.out.print("Introduce las horas trabajadas: ");
		double horas=entrada.nextInt();
		System.out.println("Su salario es: "+calcularSalario(horas)+" $ ");
		
		System.out.print("Presiona S para continuar ");
		continuar=entrada.next();	
		
		
	}while(continuar.trim().equalsIgnoreCase("s"));
		System.out.println("\nFin del programa");
		entrada.close();	
		
	}
	static double calcularSalario(double horas) {
		double salario;
		if(horas<=35) {
			salario=horas*15;
			return salario;
		}else {
			salario=(35*15)+((horas-35)*22);  
			return salario;
		}
		

	}

}
