package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio33 {
		/*realizar un juego para adivinar un numero
		para ello generar un numero leatorio entre
		0-100 y luego ir pidiendo numeros indicando
		"es mayor" o "es menor" segun sea mayor o menor
		con respecto a N. El proceso termina cuando el 
		usuario acierta y mostrar el numero de intentos*/
	public static void main(String[] args) {
		// 
		
		Scanner entrada=new Scanner(System.in);
		
		int numero,aleatorio,contador=0;
		
		aleatorio=(int)(Math.random()*100); //genera un numero aleatorio
		
		System.out.println("Introduce un numero: ");
		numero=entrada.nextInt();
		
		do {
			
			
		if(aleatorio>numero) {
			System.out.println("Digite un numero mayor");
			numero=entrada.nextInt();
		}else {
			System.out.println("Digite un numero menor");
			numero=entrada.nextInt();
		}
		contador++;//aumentamos en 1 el contador cada vez que usuario digite un numero
		
		}while(numero!=aleatorio);
	
		System.out.println("Adivinaste en tsntos intentos "+contador);
		entrada.close();

	}

}
