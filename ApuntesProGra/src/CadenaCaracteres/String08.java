package CadenaCaracteres;
import java.util.Date;

public class String08 {
	public static void main(String args[]) {
		long marcaTiempo = new Date().getTime();
		 
     	StringBuffer colector = new StringBuffer("Numeros: ");
     	for(int i = 1; i <= 50000; i++) {
     		// El metodo append() de StringBuilder y StringBuffer
     		// es llamado automáticamente a menudo a través del operador +
          	colector.append(i);
     	}
     	System.out.println("Tiempo: " + (new Date().getTime() - marcaTiempo) + " ms");
     	System.out.println("Total caracteres: " + colector.length());
     	System.out.println(colector.substring(0, 50000));	
	}

}
