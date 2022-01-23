package Teoria2;
import java.util.Scanner;
//metodo que nos pida dos numeros e introduzac el texto que quiero mostrar
public class Ejemplo_Metodo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto=teclado.nextLine();
		
		System.out.print("Introduce el primer numero:");
		int num1=teclado.nextInt();
		
		System.out.print("Introduce el segundo numero:");
		int num2=teclado.nextInt();
		
		//esta haciendo la llamada al mayor
		int mayor=mayor(num1,num2);
		
		//guardar en un sTRING EL RESULTADO DE LA LLAMADA
		String mensaje=mostrarMensajeConNumero(texto,mayor);
		System.out.print(mensaje);
		//para simplificar esto String mensaje=mostrarMensajeConNumero(texto,mayor(num1,num2));
		//System.out.print(mensaje);
		teclado.close();
	}
	//primer metodo
	static int mayor(int a,int b) {
		
		if(a>b) {
			return a ;
		}
		return b;
	}
	//segundo metodo
	static String mostrarMensajeConNumero(String texto,int numero) {
		//me devuelve el texto y numero concatenados
		return texto+numero;
	}
}
