package practica3;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		num = entrada.nextInt();
		
		if(num%2==0 ) {
			System.err.println("Solo numeros impares");
		}else {
			rombo(num);
		}
		
	}
	static void rombo(int num) {
		
		String dibujo="";
		
		int mid = num / 2;
		int contador = 0;
		int contador_dos = 0;
		int contador_tres = 2;
		
		
		System.out.println();
		for (int i = 0; i < num; i++) {
			if(i <= mid) {
				for (int j = num - 1 - i; j >= 0; j--) {
					dibujo +=" ";
				}
				
				for (int j = 0; j <= contador; j++) {
					dibujo +="*";
				}
				contador += 2;
				
				dibujo +="\n\n";
				
			}
			else {
				contador_dos++;
				for (int j = (num / 2) + contador_dos; j >= 0; j--) {
					//System.out.print(" ");
					dibujo +=" ";
				}
				
				for (int j = (num - contador_tres); j >= 1; j--) {
					//System.out.print("*");
					dibujo +="*";
				}
				
				mid -= 2;
				contador_tres += 2;
				//System.out.println("");
				dibujo +="\n\n";
				
			}
		}
		System.out.print(dibujo);;
	}
}
