package Teoria1;
import java.util.Scanner;

public class Ejemplo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
			
        double nota;
        
        String resultado ="";
        
        System.out.print("Introduce una nota: ");
        nota = teclado.nextDouble();
        
        if(nota >=0 && nota<5) {
        
        System.out.println("Insuficiente");
        
        }else if(nota >=5 && nota <6) {
        
        System.out.println("Suficiente");
        
        }else if(nota >=6 && nota <7) {
        
        System.out.println("Bien");
        
        }else if(nota >=7 && nota <9) {
        	
        System.out.println("Notable");
        	
        }else if(nota >=9 && nota <=10) {
        
        System.out.println("Sobresaliente");
         	
        }
	

	}

}
