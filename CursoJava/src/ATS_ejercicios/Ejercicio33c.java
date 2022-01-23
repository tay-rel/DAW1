package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio33c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		int numero,contador=0,total=0;
		float media=0;
		System.out.println("Introduzca un número: ");
		numero=entrada.nextInt();
		
		while(numero>=0) {
			total+=numero;//(total=total+numero)	
			//guarda la suma de mis numeros (4+5+6+4)
			System.out.println("Introduzca otro número: ");
			numero=entrada.nextInt();
			
			contador++;//guarda el total de numeros introducidos
		}
		if(contador==0) {
			System.err.println("La division entre 0 no existe");
		}else {
			media=(float) total/contador;
		}
		
		System.out.println("Numeros introducidos "+contador);
		System.out.println("El suma de numeros introducidos es "+total+" y su media es "+media);
		entrada.close();
		//4+5+6+4/4=4.75
	}

}
