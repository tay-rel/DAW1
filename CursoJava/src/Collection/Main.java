package Collection;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TercerPaso
		/* Almacenar una coleccion de tipo cliente */

		Cliente c1 = new Cliente("Antonio Banderas", "00001", 20000);// Instanciamos el objeto
		Cliente c2 = new Cliente("Rafael Castillo", "00002", 25000);
		Cliente c3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente c4 = new Cliente("Julio Iglesias", "00004", 500000);
		
		
		//cuartoPaso
		Set<Cliente>clientesBanco=new HashSet<Cliente>();
		
		clientesBanco.add(c1);
		clientesBanco.add(c2);
		clientesBanco.add(c3);
		clientesBanco.add(c4);
		
		
		for (Cliente cliente: clientesBanco) {
			
			System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()
			+" "+cliente.getSaldo());
			
		}
	}

}
