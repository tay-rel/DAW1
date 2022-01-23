package PruebaAu4;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal pr = new Principal();
		Scanner input = new Scanner(System.in);
		
		Usuario[] users = pr.pedirUsuarios();
		
		System.out.println("\nSelecciona un usuario");
		System.out.println("------------------");
		
		for (int i = 0; i < users.length; i++) {
			if(users[i] != null) {
				System.out.println((i + 1) + " - " + users[i].l_name + ", " + users[i].name);
			}
		}
		
		System.out.print("\nUsuario: ");
		pr.mostrarUsuario(users, input.nextInt());
		
		
	}

}
