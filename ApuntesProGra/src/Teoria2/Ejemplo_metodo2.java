package Teoria2;
import java.util.Scanner;

public class Ejemplo_metodo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce el primer numero: ");
		int numero1=teclado.nextInt();
		
		System.out.println("Introduce el segundo numero: ");
		int numero2=teclado.nextInt();
		
		//la llamada es "mayor(num1,num2);"
		int resultado =mayor(numero1,numero2);
		
		System.out.println("El mayor es: "+resultado);
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
