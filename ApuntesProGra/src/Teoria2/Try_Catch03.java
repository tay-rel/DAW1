package Teoria2;
import java.util.Scanner;

public class Try_Catch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numero=pedirInt("Escribe un numero:" );
		System.out.println("El numero es "+numero);
		
		
		
	}
	static int pedirInt(String enunciado) {
		Scanner entrada=new Scanner(System.in);
		int numero=0;
		boolean correcto=false;
		
		
		while(!correcto){
			System.out.println(enunciado);
		
		try {
			numero=entrada.nextInt();
			
		}catch(Exception e) {
			
			System.out.println("El valor no es un numero entero");
			entrada.next();
			continue;
		}
		correcto=true;
		}
		 entrada.close();
		
		return numero;

	}

}
