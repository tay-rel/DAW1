package PrimerosPasos;import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double x= 10000.0;
		//System.out.printf("%1.2f",x/3);
		//esto da dos decimales al resultado
		//el 1.2 hace referncia a los dos decimales
		
		String num1=JOptionPane.showInputDialog("Introduce un numero ");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de " + num2 + " es ");
		
		System.out.printf("%1,2f",Math.sqrt(num2));

	}

}
