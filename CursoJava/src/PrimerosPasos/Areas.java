package PrimerosPasos;import java.util.*;
import javax.swing.*;
public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige una opci�n: \n1: cuadrado \n2: rect�ngulo \n3: tri�ngulo \n4: circulo");

		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Intorduce el lado"));
			
			System.out.println("El �rea del cuadrado es: " + Math.pow(lado, 2));
			//cuando tenemos un case siempre debemos acompa�ar con instruccion break
			break; 
			
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("La base del rect�ngulo es: " + base*altura);
			break;
			
		case 3:
			 base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			 altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("La base del tri�ngulo es: " + (base*altura)/2);
			break;
			
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El �rea del circulo es: ");
			System.out.printf("%1.2f", Math.PI*Math.pow(radio, 2));
			break;
			
			default:
				System.out.println("La opcion no es correcta");
				
			
		}
	}

}
