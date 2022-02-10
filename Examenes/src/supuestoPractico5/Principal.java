package supuestoPractico5;

import java.util.ArrayList;

public class Principal {

	static int max = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Pepe,,Lopez Perez,,12345678A,,C/Luna, 27, 30132, Murcia,,pepelopez@gmail.com,,12/11/1990,,normal,,0;"
				+ "Maria,,Alvarez Martinez,,87654321B,,C/ Falsa, 123, 30009, Murcia,,mariaalvarez@gmail.com,,12/10/1988,,premium,,25;"
				+ "Miguel,,Caballero Pinto,,11223344C,,C/ Olmo, 13, 30015, Murcia,,michaelknight@gmail.com,,05/02/2016,,normal,,5;";

		Cliente[] costumers = importarClientes(text);
		mostrarClientes(costumers);

	}

	private static Cliente[] importarClientes(String text) {// importa nuevos clientes en un array objeto de tipo
															// cliente
		String[] semicolon = text.split(";"); // El punto y coma separa a los clientes en el String text
		Cliente[] costumer = new Cliente[max];

		for (int i = 0; i < semicolon.length; i++) {
			String[] doubleCom = semicolon[i].split(",,"); // recorro el iterador de semicolon para separar los
															// atributos de cliente
			costumer[i] = new Cliente();

			costumer[i].nombre = doubleCom[0];
			costumer[i].apellidos = doubleCom[1];
			costumer[i].nif = doubleCom[2];
			costumer[i].direccion = doubleCom[3];
			costumer[i].email = doubleCom[4];
			costumer[i].fechaAlta = doubleCom[5];
			costumer[i].tipo = doubleCom[6];
			costumer[i].descuento = Integer.parseInt(doubleCom[7]);

		}  

		return costumer;
	}

	private static void mostrarClientes(Cliente[] datos) {

		System.err.println("Clientes\n----------------");//es (err) solo para que se vea bonito en consola

		for (int i = 0; i < datos.length; i++) {
			if (datos[i] != null) {
				System.out.println("Cliente " + (i + 1) + "\n");

				System.out.println("Nombre: " + datos[i].nombre);
				System.out.println("Apellidos: " + datos[i].apellidos);
				System.out.println("NIF: " + datos[i].nif);
				System.out.println("Direccion: " + datos[i].direccion);
				System.out.println("Email: " + datos[i].email);
				System.out.println("Fecha de alta: " + datos[i].fechaAlta);
				System.out.println("Descuento: " + datos[i].descuento + "\n");
			} else {
				System.out.println("Cliente " + (i + 1));
				System.out.println(datos[i]);
			}
		}

	}

}
