package Teoria2;
import java.util.Scanner;

public class Ejemplo2_metodo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner teclado=new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int numero1=teclado.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int numero2=teclado.nextInt();
		
		System.out.print("Introduce el tercer numero: ");
		int numero3=teclado.nextInt();
		
		System.out.print("Introduce el cuarto numero: ");
		int numero4=teclado.nextInt();
		
		//la llamada es "mayor(num1,num2);"
		int resultado1 =mayor(numero1,numero2);
		int resultado2=mayor(numero3,numero4);
		int resultadofinal=mayor(resultado1,resultado2);
		
		System.out.print("El mayor es: "+resultadofinal);
		//esto para no usar otra variable
		//System.out.println("El mayor es: "+mayor(num1,num2));
		
		teclado.close();
		
	}
		static int mayor(int a,int b) {
			if(a>b) {
				return a;
			
			//es como ponerle un else
			}return b;
	
	}

}
