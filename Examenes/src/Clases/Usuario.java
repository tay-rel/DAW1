package Clases;

abstract class Usuario {
	private int id;
	private String username;
	private String nombre;
	private String email;
	private static int IdSiguiente = 1;

	public Usuario(int id, String username, String nombre, String email) {
		this.id = id;
		this.username = username;
		this.nombre = nombre;
		this.email = email;
		this.id = IdSiguiente;
		IdSiguiente++;// incrementa en uno el valor de la variable siguiente

	}

	public String toString() {// metodo getter
		return " ID= " + this.id + "Nombre de usuario: " + this.username + "Email: " + this.email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getIdSiguiente() {
		return IdSiguiente;
	}

	public static void setIdSiguiente(int idSiguiente) {
		IdSiguiente = idSiguiente;
	}

}
