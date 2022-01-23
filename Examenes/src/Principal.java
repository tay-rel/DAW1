

import java.util.Scanner;

/*Nombre: Alejandra Ariel Mayta Salazar
 * Daw 1
20/01/2022

*/
public class Principal {
	final static int CANTIDAD=4;
	
public static void main(String[]args) {
	
	//Usuario pedir=new Usuario();
	
	Scanner entrada = new Scanner(System.in);
	
	Usuario[] usuarios = pedirUsuarios();
	
	
	System.out.println("\nSelecciona un usuario");
	System.out.println("------------------");
	
	for (int i = 0; i < usuarios.length; i++) {
			System.out.println((i + 1) 
					+ " - " + usuarios[i].apellidos + ", " + usuarios[i].nombre); //Muestra Primero apellido y uego nombre
		
	}
	
	System.out.print("Usuario: ");
	System.out.println();
	int posicion=entrada.nextInt();
	mostrarUsuarios(usuarios,posicion);
	
	
		
		
	}
 	public static Usuario[] pedirUsuarios() {
	 Usuario [] usuarios= new Usuario[CANTIDAD];
	  
	 for (int i = 0; i < usuarios.length; i++) { //pido la introduccion de los usuarios secuencialmenre
		Scanner entrada= new Scanner(System.in);
		Usuario clase = new Usuario();
		System.out.println(" <Usuario> "+(i+1)+" º");
		
		System.out.print("Nombre: ");
		clase.nombre=entrada.nextLine().trim();
		System.out.print("Apellido: ");
		clase.apellidos=entrada.nextLine().trim();
		System.out.print("Direccion email: ");
		clase.email=entrada.nextLine().trim();
		
		usuarios[i]=clase;
	}
	 for (int i = 0; i < usuarios.length; i++) {
		System.out.println();
		System.out.println((i+1)+"º"+". Usuario");
		System.out.println("---------------------");
		System.out.println("Nombre: "+usuarios[i].nombre);
		System.out.println("Apellidos: "+usuarios[i].apellidos);
		System.out.println("Email: "+usuarios[i].email);
	}
	 //retorno el array ordenado
	 
	 return ordenarUsuarios(usuarios);
		
 	}
 	public static Usuario[]ordenarUsuarios(Usuario[]array){
 		Usuario auxiliar= new Usuario();
 		
 		for (int i = 0; i < array.length; i++) {
			int contador = 0;
			auxiliar = array[i];
			
			for (int j = i; j < array.length; j++) {
				if(array[j].apellidos.compareToIgnoreCase(auxiliar.apellidos) < 0) {
					 contador = j;
					auxiliar = array[j];
					array[j]=array[j+1];
					array[j+1]=auxiliar;
				}
			}	
 				
			//array[auxiliar] = array[i];
 		}
		
 		//devuelve el mismo array de usuarios
 		return array;
 		
 	}
 	public static void mostrarUsuarios(Usuario[]array, int posicion) {
 		posicion=posicion-1;
 		try {
 		System.out.println("USUARIO");
 		System.out.println("--------");
 		System.out.println("Nombre: "+array[posicion].nombre);
 		System.out.println("Apellidos: "+array[posicion].apellidos);
 		System.out.println("Email: "+array[posicion].email);
 		}catch(Exception e) {
 			System.err.println("El usuario no existe");
 		}
 		
		
	}

}
