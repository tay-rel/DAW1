package Teoria1;
import java.util.Scanner;

public class Ejemplo17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner (System.in);
		int i,j,num=0;
		
		System.out.println("Introduce el número: ");
		num=entrada.nextInt();
		
		for(i=1; i<=num ; i++) {
			
			for(j=1; j<=num; j++) {
			
				if(i==1 || i==num || j==1 || j==num) {
					
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				System.out.print(" ");
				
			}
			System.out.println(" ");
			
		}
	
	}

}
