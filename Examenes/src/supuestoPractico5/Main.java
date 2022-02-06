package supuestoPractico5;

import java.util.ArrayList;

public class Main {
	
	static int max=10; 

	public static void main(String[] args) {
		
		//User [] users=new User
		String text = "Pepe,,Lopez Perez,,12345678A,,C/Luna, 27, 30132, Murcia,,pepelopez@gmail.com,,12/11/1990,,normal,,0;"
				+ "Maria,,Alvarez Martinez,,87654321B,,C/ Falsa, 123, 30009, Murcia,,mariaalvarez@gmail.com,,12/10/1988,,premium,,25;"
				+ "Miguel,,Cballero Pinto,,11223344C,,C/ Olmo, 13, 30015, Murcia,,michaelknight@gmail.com,,05/02/2016,,normal,,5;";
		
		Costumer[] clientes=importarClientes(text);
		
		mostrarClientes(clientes);
		
	}

	public static Costumer[] importarClientes(String text) { //importa nuevos clientes en un array objeto de tipo cliente
			
		String[] separate=text.split(";");	
		Costumer[] cliente=new Costumer[separate.length +max]; //carga objetos de la clase cliente
		
		for (int i = 0; i < separate.length; i++) {
			String[] aux = separate[i].split(",,");
			cliente[i]=new Costumer();
			
			cliente[i].name=aux[0];
			cliente[i].lastname=aux[1];
			cliente[i].nif=aux[2];
			cliente[i].address=aux[3];
			cliente[i].email=aux[4];
			cliente[i].dischargeDate=aux[5];
			cliente[i].type=aux[5];
			cliente[i].discount=Integer.parseInt(aux[7]);			
	
	}

		
		return cliente;
	}
	
	public static void mostrarClientes(Costumer[] clientes) { //recibe un array de tipo cliente
		
		System.out.println("Clientes");
		System.out.println("--------");
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i]!= null) {
				System.out.println("Cliente"+(i+1)+"\n");
				
				System.out.println("Nombre: "+clientes[i].name);
				System.out.println("Apellidos: "+clientes[i].lastname);
				System.out.println("NIF: "+clientes[i].nif);
				System.out.println("Direccion: "+clientes[i].address);
				System.out.println("Email: "+clientes[i].email);
				System.out.println("Fecha de Alta: "+clientes[i].dischargeDate);
				System.out.println("Tpo de Cliente: "+clientes[i].type);
				System.out.println("Descuento: "+clientes[i].discount+"\n");
			}else {
				System.out.println("Cliente "+(i+1));
				System.out.println(clientes[i]);
				
			}
		}

	}

}
