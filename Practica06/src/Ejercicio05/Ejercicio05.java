package Ejercicio05;

import java.util.ArrayList;

public class Ejercicio05 {
	public static ArrayList<Integer> listaUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> listaUnion = new ArrayList<Integer>();
		listaUnion.addAll(list1);// añade todos los elementos de la list1
		for (Integer item : list2) {// los elemntos no repetidos de la list2
			if (!listaUnion.contains(item)) {
				listaUnion.add(item);
			}
		}
		return listaUnion;
	}

	public static ArrayList<Integer> listaIntersec(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> listaIntersec = new ArrayList<Integer>();
		for (Integer item : list1) {
			if (list2.contains(item)) {
				listaIntersec.add(item);
			}
		}
		return listaIntersec;
	}

	// segunda version sin bucle
	public static ArrayList<Integer> lU(ArrayList<Integer> lU1, ArrayList<Integer> lU2) {
		ArrayList<Integer> listaU = new ArrayList<Integer>();
		// PRIMER PASO-añadir list1 a listaU
		listaU.addAll(lU1);
		// SEGUNDO PASO-Borrar en listU todo lo que coincida con list2
		listaU.removeAll(lU2);
		// TERCER PASO -AÑADIR LIST2 A LISTAu
		listaU.addAll(lU2);

		return listaU;
	}

	public static ArrayList<Integer> listaI(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> listaInter = new ArrayList<Integer>();
		listaInter.addAll(list1);
		//retainAll elimina todos los elementos que no esten en la list2
		listaInter.retainAll(list2);

		return listaInter;
	}

	public static void printLista(ArrayList<Integer> lista) {
		System.out.print("{ ");
		for (Integer elem : lista) {
			System.out.print(elem);
			System.out.print(" ");
		}
		System.out.println("}");
	}

	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		lista1.add(1);
		lista1.add(2);
		lista1.add(3);
		lista1.add(4);
		lista1.add(5);
		System.out.print("Primera lista:\t\t");
		printLista(lista1);

		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		lista2.add(2);
		lista2.add(4);
		lista2.add(6);
		System.out.print("Segunda lista:\t\t");
		printLista(lista2);

		// La union agrupa lo que hay en las dos los listas
		ArrayList<Integer> listaUnion = lU(lista1, lista2);
		System.out.print("Lista unión:\t\t");
		printLista(listaUnion);

		// la intereseccion agrupa los comunes de las dos listas
		ArrayList<Integer> listaIntersec = listaI(lista1, lista2);
		System.out.print("Lista intersección:\t");
		printLista(listaIntersec);

	}
}
