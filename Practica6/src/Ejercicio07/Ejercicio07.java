package Ejercicio07;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		
		Queue<String> mensajes = new LinkedList<String>();
		mensajes.offer("Mensaje Uno");
		mensajes.offer("Mensaje Dos");
		mensajes.offer("Mensaje Tres");
		mensajes.offer("Mensaje Cuatro");

		
		System.out.println("Cola completa");
		System.out.println(mensajes);
		while (mensajes.size() > 0) {
			String msg = mensajes.poll();
			System.out.println(msg);
		}
	}
}
