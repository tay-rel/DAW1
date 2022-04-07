package Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente extends Usuario implements Acciones {

	private ArrayList<Item> listaItem;

	public Cliente(int id, String username, String nombre, String email) {
		super(id, username, nombre, email);

	}

	public String toString() {
		return super.toString();
	}

	public void addItem(Item item) {
	
		for (int i = 0; i < listaItem.size(); i++) {
			//listaItem.add(item);
			listaItem.add(new Item(getNombre(), getEmail(), getId()));
		}
		
		
		
		//listaItem.add(item);
		
	}

	public void mostrarItem(int indice) {
		if (indice <= listaItem.size()) {
			System.out.println(listaItem.get(indice).getNombre()
					+listaItem.get(indice).getDescripcion()
					+listaItem.get(indice).getPrecio());
			
		//listaItem.get(indice).toString();
		System.out.println(listaItem.get(indice).toString());
			System.out.println(listaItem.getClass());
		}
		
	}

	public void listarTodos() {

		for (int i = 0; i < listaItem.size(); i++) {
			System.out.println("Nombre: "+listaItem.get(i).getNombre()
					+"Descripcion: "+listaItem.get(i).getDescripcion()
					+"Precio: "+listaItem.get(i).getPrecio());
		}
	}

	public void eliminarItem(int indice) {

		listaItem.remove(listaItem);
	}

	public double precioTotal() {

		
		return 0;
	}

}
