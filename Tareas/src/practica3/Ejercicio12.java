package practica3;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		num = entrada.nextInt();
		
		
		System.out.println(trianguloTexto(num));
		
		
		
		entrada.close();
		
	}
	
	static String trianguloTexto(int num) {
		
		String txt="";
		int contador = 0;
		
		for (int i = 0; i < num; i++) {

			for (int j = num - 1 - i; j >= 0; j--) {
				txt +=" ";
			}
			
			for (int j = 0; j <= contador; j++) {
				txt +="*";
			}
			contador += 2;
			txt +="\n";
			txt +="\n";
		}
		
		return txt;
		

	}

}
