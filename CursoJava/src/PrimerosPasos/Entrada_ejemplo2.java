package PrimerosPasos;import javax.swing.*;
public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, porfavor");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad, porfavor");
		//debo intrducir parseInt(edad) para que nos de un int
		int edad_usuario=Integer.parseInt(edad);
		edad_usuario ++;  //(edad_usuario+1)
		System.out.println("Hola " + Nombre_usuario + " tendras " + edad_usuario + " años ");
		
		
		
		

	}

}
