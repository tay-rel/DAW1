package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio27 {
	/*while(condicion) {
			instrucciones;
		}bucle*/

	public static void main(String[] args) {
		//aumenta 
		/*int i=1;
		while(i<=10) {//podemos hacer siempre condiciones siempre y cuando se cumpla
			System.out.println(i);//1 2 ....10
			i++;	//aumenta en 1 la i
		}*/
		
		//disminuye
		/*int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;	
		}*/
		
		Scanner entrada=new Scanner(System.in);
		int i=1,contador;
		System.out.print("Digite un numero: ");
		contador=entrada.nextInt();//guardamos cuantos numero quiere que se repita el usuario
		
		while(i<=contador) {//evalua la condicion
			System.out.println(i);
			i+=2;//si pongo contador aqui, el bucle no acaba porque la condicion no se cumple
		}

		entrada.close();
	}

}
