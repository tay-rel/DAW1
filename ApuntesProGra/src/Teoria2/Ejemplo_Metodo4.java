package Teoria2;
import java.util.Scanner;
//ejemplo definicion y llamada al metodo

public class Ejemplo_Metodo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Tu nombre: ");
		String name=teclado.nextLine();
		
		System.out.print("Tus apellidos: ");
		String surname=teclado.nextLine();
		
		System.out.print("Tus edad: ");
		int age=teclado.nextInt();
		
		//importa el orden 
		String texto=formarNombre(name,surname,age);
		
		System.out.print(texto);
		
		teclado.close();

	}
	//debo poner dentro de argumentos
	//el orden es importante
	static String formarNombre(String nombre,String apellidos,int edad) {
		
		return "Tu nombre es " + nombre+" "+apellidos+"\nTu edad es "+edad;
	}

}
