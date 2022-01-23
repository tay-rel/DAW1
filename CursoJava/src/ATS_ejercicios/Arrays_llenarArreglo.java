package ATS_ejercicios;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arrays_llenarArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		int nElementos;
		
		nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del arreglo: "));
		
		char[] letras=new char[nElementos];
		
		System.out.println("Digite los elementos del arreglo: ");
		
		for(int i =0;i<nElementos;i++) {
			System.out.print((i+1)+" "+"Digite un caracter: ");
			letras[i]=entrada.next().charAt(0);		
		}
		//debemos pedirle cuantos caraceres quiere el usuario
		System.out.print("\nLos caracteres de arreglo son: ");
		for(int i=0;i<nElementos;i++) {
			System.out.print(letras[i]+", ");
		}

	}

}
