
package Teoria2;
import java.util.Scanner;

public class Ejemplo1_metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int numero=teclado.nextInt();
		
		System.out.print("Introduce un segundo número: ");
		int numero2=teclado.nextInt();
		
		System.out.print("Introduce un tercer número: ");
		int numero3=teclado.nextInt();
		
		System.out.print("Introduce un cuarto número: ");
		int numero4=teclado.nextInt();
		
		//hacemos la llamda al metodo
		//tipo de llamada ej: (numero,numero2)
		//num(primer parametro)
		muestraMensaje(numero,numero2);
		muestraMensaje(numero3,numero4);
		
		
		
		teclado.close();
	}
	/*definicion de parametros
	 * debo poner como primer parametro
	 * un valor de tipo entero
	 * 
	 * intnum1 es el tipo de entrada
	 * y debe ser igual que el tipo de llamada
	 */
	//creo mi segundo metódo
	static void muestraMensaje(int num1,int num2) {
		System.out.println("El número recibido es: "+num1);
		System.out.println("El segundo número recibido es: "+num2);
		/*los metodos sirven para tener un codigo mas limpio
		 * 
		 */


	}

}
