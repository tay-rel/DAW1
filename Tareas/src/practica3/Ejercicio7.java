package practica3;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
	
		System.out.print("Introduce un número positivo: ");
		int num=entrada.nextInt();
		
		System.out.println("El factorial de "+num+" es "+factorial(num));
		
		entrada.close();
		
	}

    static int factorial(int num) {
    	int total=1;
    	if(num<0) {
    		return -1;
    	}else if(num==0) {
    		return 1;
    	}
       for(int i=1;i<=num;i++) {
    	 
    	   total=total*i;	   
       }
       return total;
    	   
	}

}
