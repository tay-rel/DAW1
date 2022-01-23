package practica3;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
	
		int num;
		System.out.print("Ingrese cantidad de elementos para la serie: ");
		num=entrada.nextInt();
		System.out.println("El elemento de  "+num+" es: "+fibonacci(num));
		
		entrada.close();
	}
	static int fibonacci(int num) {
		int a=0;
		int b=1;
		int suma=1;
		if(num<0) {
			return -1;
		}
		if(num==0) {
			return 0;
		}
	
		for(int i=1;i<num;i++) {
		
				suma=a+b;
				a=b;
				b=suma;
				//en el bucle for no debe a haber un return
		}
		return suma;
	}

}
