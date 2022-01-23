package Teoria1;
import java.util.Scanner;

public class Ejemplo20_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sintaxis de Switch
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el número: ");
		int camaron=teclado.nextInt();
		
		String dia;
		
		switch(camaron) {
		
		case 1: dia="Lunes";
			//codigo
				break;
		case 2: dia="Martes";
			//codigo
			break;
		case 3: dia="Miercoles";
		//codigo
		break;
		case 4: dia="Jueves";
		//codigo
		break;
		case 5: dia="Viernes";
		//codigo
		break;
		case 6: dia="Sábado";
		//codigo
		break;
		case 7: dia="Domingo";
		//codigo
		break;
			
		default: dia= "Día inválido";	
		}
			System.out.println(dia);
	}

}
