package PrimerosPasos;


import javax.swing.*;
public class Acceso_aplicaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave="Juan";
		
		String pass="";
		//equals() compara dos cadenas de texto
		//==operador de comparaci�n
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Contrase�a incorrecta");
				
			}
			
		}
		
		System.out.println("Contrase�a corecta.Acceso permitido");
		
	}

}
