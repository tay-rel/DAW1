package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio28 {

	/*do {
		instrucciones;
	}while(condicion); */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);*/
		
		//de mayor a menor 
		/*int i=10;
		do {
			System.out.println(i);
			i--;
		}while(i>=1);*/
		
		Scanner entrada=new Scanner(System.in);
		int i=1,contador;
		System.out.print("Digite un numero: ");
		contador=entrada.nextInt();
		do {	//sirve para opciones
			System.out.println(i);
			i++;
			
		}while(i<=contador);
		entrada.close();
	}

}
