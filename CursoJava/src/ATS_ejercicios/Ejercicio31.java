package ATS_ejercicios;import java.util.Scanner;

public class Ejercicio31 {
/*lee un numero e indicar si es positivo o negativo el proceso se repetira hasta que se
 * introduzca un cero*/
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int numero;
		System.out.print("Introduce un numero: ");
		numero=entrada.nextInt();
		while(numero!=0) {
			if(numero>0) {
				System.out.println(numero+" =Este numero es positivo");
			}else {
				System.out.println(numero+" =Estenumero es negativo");
			}
			System.out.print("Introduce un numero: ");
			numero=entrada.nextInt();
		}
		
		entrada.close();

	}

}
