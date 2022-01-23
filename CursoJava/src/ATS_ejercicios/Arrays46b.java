package ATS_ejercicios;
import java.util.Scanner;


		import javax.swing.JOptionPane;

public class Arrays46b {

public static void main(String[] args) {
			 
		 Scanner entrada=new Scanner(System.in);

		     int [] x = new int [12], y = new int [12];
		            
			 //pedir el arreglo a 
			 System.out.println(" Digite el primer arreglo");
		  
		  for(int i=0; i<12;i++) {
		   
			  System.out.print((i+1)+" Digite un numero: ");
			  x[i]=entrada.nextInt();
		  }
		  //pedir el arreglo a 
			 System.out.println(" Digite el primer arreglo");
		  
		  
		  for(int i=0; i<12;i++) {
		   
			  System.out.print((i+1)+" Digite un numero: ");
			  y[i]=entrada.nextInt();
		   
		  }
		  
		  int [] z = new int [24];
		  
		  for(int i=0,j=0; i<12; i++) {
		   
			   z[j]=x[i];
			   z[j+3]=y[i];
			   j++;
			   
			if(j==3 || j==9 ||  j==15) {
			    j+=3; 
			   }
			   
		  }
		  
		  System.out.print("\nEl tercer arreglos es: ");
			for(int i=0;i<24;i++) {
				System.out.print(z[i]+" ");
			}
			System.out.println();
		 
	}

}
