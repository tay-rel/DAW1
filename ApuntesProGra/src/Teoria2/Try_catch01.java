package Teoria2;
import java.util.Scanner;

public class Try_catch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.print("Indica un numero para dividir: ");
		int num1=entrada.nextInt();
		System.out.print("Indica el segundo numero para dividir con el anterior: ");
		int num2=entrada.nextInt();
		boolean correcto=true;
		try {
			System.out.println(num1+"/"+num2+" = "+(num1/num2));
			
		}catch(Exception e) {
			System.out.println("No se puede dividir entre 0");
			correcto=false;
		}finally {
			System.out.println("La division se ha ejecutado con "+(correcto ?"exito":"errores"));
		}
		
		entrada.close();
	}

}
