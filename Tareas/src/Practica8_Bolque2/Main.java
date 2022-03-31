package Practica8_Bolque2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Estudiante: ");
		
		ArrayList<Estudiante> lista= new ArrayList <Estudiante>();
		lista.add(new Estudiante("AAA", "AAA ", 6.5));
		lista.add(new Estudiante("BBB", "BBB ", 6.5));
		lista.add(new Estudiante("CCC", "CCC ", 2.5));
		lista.add(new Estudiante("DDD", "DDD ", 6.5));
		lista.add(new Estudiante("EEE", "EEE ", 6.5));
		lista.add(new Estudiante("EEE", "EEE ", 8.5));
		lista.add(new Estudiante("FFF", "FFF ", 6.5));
		lista.add(new Estudiante("GGG", "GGG ", 6.5));
		lista.add(new Estudiante("HHH", "HHH ", 4.5));
		lista.add(new Estudiante("III", "III ", 7.5));
		lista.add(new Estudiante("JJJ", "JJJ ", 6.5));
		lista.add(new Estudiante("KKK", "KKK ", 0.3));
		lista.add(new Estudiante("LLL", "LLL ", 6.5));
		lista.add(new Estudiante("MMM", "MMM ", 5.5));
		
		
		//ORDENA LA CLASE COLLECTIONS
		
		Collections.sort(lista);
		
		//Ordenar con el algoritmo de la burbuja y el metodo . compareTo
		

			/*for (int i = 0; i < lista.size(); i++) { //compara desde el segundo
				for (int j = i; j < lista.size(); j++) {//con el compareTo esta llmando a la condicion
					if (lista.get(i).compareTo(lista.get(j))==1) {
						Estudiante aux=lista.get(i);
						lista.set(i, lista.get(j));
						lista.set(j, aux);
					}
				}
			
			}*/
			
			

		
		
		//listar estudiantedo
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	
		/*TRABAJADOR*/
		
		
		ArrayList<Trabajador> lista2= new ArrayList <Trabajador>();
		lista2.add(new Trabajador("AAA", "AAA ", 6));
		lista2.add(new Trabajador("BBB", "BBB ", 6));
		lista2.add(new Trabajador("CCC", "CCC ", 4));
		lista2.add(new Trabajador("DDD", "DDD ", 5));
		lista2.add(new Trabajador("EEE", "EEE ", 4));
		lista2.add(new Trabajador("EEE", "EEE ", 1));
		lista2.add(new Trabajador("FFF", "FFF ", 2));
		lista2.add(new Trabajador("GGG", "GGG ", 6));
		lista2.add(new Trabajador("HHH", "HHH ", 4));
		lista2.add(new Trabajador("III", "III ", 7));
		lista2.add(new Trabajador("JJJ", "JJJ ", 6));
		lista2.add(new Trabajador("KKK", "KKK ", 0));
		lista2.add(new Trabajador("LLL", "LLL ", 2));
		lista2.add(new Trabajador("MMM", "MMM ", 5));
		
		
		double precio =9.23;
		for (int i = 0; i < lista2.size(); i++) {
			lista2.get(i).calcularSueldo(precio);
		}
		
		
		//ordenamiento inversa
		for (int i = 0; i < lista2.size(); i++) { //compara desde el segundo
			for (int j = i; j < lista2.size(); j++) {//con el compareTo esta llmando a la condicion
				if (lista2.get(i).compareTo(lista2.get(j))==-1) {
					Trabajador aux2=lista2.get(i);
					lista2.set(i, lista2.get(j));
					lista2.set(j, aux2);
				}
			}
		
		}
		
		
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
		
		
		
		
		
		
	}

}
