package PruebaAu4;
public class Principal {
	final static int CANTIDAD = 4;
	static String[][] dataUsers = {
			{"Jose", "Minguez Ortiz", "joseminguez123@gmail.com"},
			{"Maria", "Martinez Alto", "mariamrtzalto@gmail.com"},
			{"Francisco", "Velez Vives", "franciscovv@gmail.com"},
			{"Ana Rosa", "Villanueva Perez", "anarosavillaperez@gmail.com"},
			};
	
	
	public Usuario[] pedirUsuarios() {
		Usuario[] users = new Usuario[CANTIDAD];
		
		for (int i = 0; i < dataUsers.length; i++) {
			Usuario user = new Usuario();
			
			user.name = dataUsers[i][0];
			user.l_name = dataUsers[i][1];
			user.email = dataUsers[i][2];
			
			users[i] = user;
		}
		
		for (int i = 0; i < users.length; i++) {
			System.out.println();
			System.out.println((i + 1) + "º" + " Usuario");
			System.out.println("----------");
			System.out.println("Nombre: " + users[i].name);
			System.out.println("Apellidos: " + users[i].l_name);
			System.out.println("Email: " + users[i].email);
			System.out.println();
		}
		
		return ordenarUsuarios(users);
		
	}
	
	private Usuario[] ordenarUsuarios(Usuario[] aUsers) {
		Usuario aux = new Usuario();
		
		for (int i = 0; i < aUsers.length; i++) {
			int k = i;
			aux = aUsers[i];
			
			for (int j = i; j < aUsers.length; j++) {
				if(aUsers[j].l_name.compareToIgnoreCase(aux.l_name) < 0) {
					k = j;
					aux = aUsers[j];
				}
			}	
				
			aUsers[k] = aUsers[i];
			aUsers[i] = aux;
		}
		
		return aUsers;
	}
	
	public void mostrarUsuario(Usuario[] aUsers, int index) {
		index--;
		
		try {
			System.out.println("\nUSUARIO");
			System.out.println("----------");
			System.out.println("Nombre: " + aUsers[index].name);
			System.out.println("Apellidos: " + aUsers[index].l_name);
			System.out.println("Email: " + aUsers[index].email);
			System.out.println();
		}
		catch(java.util.InputMismatchException e) {
			System.err.println("\nEl usuario no existe.");
		}
	}

}
