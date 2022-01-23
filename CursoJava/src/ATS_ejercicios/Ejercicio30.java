package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio30 {
	/*leer un numero y mostrar su cuadrado,
	repetir el proceso hasta que se introduzca un numero negativo*/
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		 int numero,cuadrado=0;
		 
		 
		 System.out.print("Introduce un número: ");
		 numero=entrada.nextInt();
		 
		 while(numero>=0) {
			 
			 cuadrado=(int) Math.pow(numero, 2);//usamos int para poder usar el double transformandole a int
			 System.out.println("El cuadrado de "+numero+" es "+cuadrado);
			 
			 System.out.print("Introduce un número: ");
			 numero=entrada.nextInt();
			 if(numero<0) {
				 System.err.println("El numero no es valido en esta operacion");
			 }
			 
		 }
		
		

	}

}
