package CadenaCaracteres;
import java.util.Date;

public class String08 {
	/* no se puede mostrar todo el contenido 
	 * debido a que la consola tiene un buffer de un tamaño limitado */
	public static void main(String args[]) {
		long marcaTiempo = new Date().getTime();
		 
     	StringBuffer colector = new StringBuffer("Numeros: ");
     	for(int i = 1; i <= 50000; i++) {
     		// El metodo append() de StringBuilder y StringBuffer
     		// es llamado automaticamente a menudo a traves del operador +
          	colector.append(i);
     	}
     	System.out.println("Tiempo: " + (new Date().getTime() - marcaTiempo) + " ms");
     	System.out.println("Total caracteres: " + colector.length());
     	System.out.println(colector.substring(0, 50000));	
	}

}
