package Swing04;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejemplo04 extends WindowAdapter {
	public static void main(String[] args) {
		//Aqui creamos la ventana
		VentanaInterna ventana = new VentanaInterna("Ejemplo de ventanas multiples");
		ventana.setVisible(true);
	}
	
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
}