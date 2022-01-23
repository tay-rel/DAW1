package Teoria1;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
        double nota;
        
        String resultado ="Nota no Valida";
        
        System.out.print("Introduce una nota: ");
        nota = teclado.nextDouble();
        
        if(nota >=0 && nota<5) {
        
        resultado ="Insuficiente";
        
        }else if(nota >=5 && nota <6) {
        
        resultado = "Suficiente";
        
        }else if(nota >=6 && nota <7) {
        
       resultado = "Bien";
        
        }else if(nota >=7 && nota <9) {
        	
        resultado = "Notable";
        	
        }else if(nota >=9 && nota <=10) {
        
        resultado ="Sobresaliente";
         	
        }
	
		System.out.println(resultado);
	
	}

}
