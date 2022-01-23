package Teoria2;
import java.util.Scanner;

public class Ejemplo_Metodo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero=teclado.nextInt();
		
		//el numero lo psamos al metodo esPar
		boolean resultado=esPar(numero);
		if(resultado) {
			System.out.println(numero+" es par");
		}else {
			System.out.println(numero+" es impar");
		}
		
		teclado.close();
		
	}
	//metodos que devuelven bolleanos
	static boolean esPar(int numero) {
		//return (numero%2==0);
		if(numero%2==0) {
			return true;
		}
		return false;
	}

}
