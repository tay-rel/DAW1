package Teoria1;
import java.util.Scanner;

public class Ejemplode_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado=new Scanner(System.in);
		int suma=0,ultimo,cantidad=0;
		do { 
			System.out.print("Introduce un numero positivo: ");
			ultimo=teclado.nextInt();
			if(ultimo>0) { //positivos
				
				cantidad ++;
				suma +=ultimo;//importante las separaciones
				
			}else if(ultimo<0) {
				System.out.println("Los negativos no son validos");
			}
			
		} while(ultimo !=0);
		System.out.println("la suma es: " + suma);
		
		if(cantidad>0) {
		System.out.println("La media aritmetica es: " + (suma/ cantidad));
		
	    }else {
	    	System.out.println("La media aritmetica es: 0");
	    	
	    }
		
	}
}
