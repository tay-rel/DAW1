package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio29 {

	/*ciclo for
	for(inicializacion;condicion;aumento o decremento) {
		instruciiones;
	}*/
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		
		for(int j=10;j>=0;j--) {
			System.out.println(j);
		}
		Scanner entrada=new Scanner(System.in);
		int contador;
		System.out.print("Digite un numero: ");
		contador=entrada.nextInt();
		
		for(int i=1;i<=contador;i+=2) {
			System.out.println(i);
		}

	}

}
