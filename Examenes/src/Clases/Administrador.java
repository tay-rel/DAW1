package Clases;

public class Administrador extends Usuario {

	public Administrador(int id, String username, String nombre, String email) {
		super(id, username, nombre, email);

	}

	public String toString() {
		return super.toString();
	}

	public Cliente crearCliente(int id, String username, String nombre, String email) {
		Cliente c = new Cliente(id, username, nombre, email);

	return c;
	}

}
