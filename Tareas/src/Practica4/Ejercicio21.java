import java.util.ArrayList;

public class Ejercicio21 {
	/* "Criba de Eratóstenes"*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Los siguientes son numeros primos");
		System.out.println(obtenerPrimos(100));

	}

	public static ArrayList<Integer> obtenerPrimos(int limite) {

		ArrayList<Integer> lista = new ArrayList<Integer>(); //lista de arrays 

		  boolean primo[] = new boolean[limite +1];
		  
		  for (int i = 2; i <= limite; i++) {
			  
			if(primo[i]== false) {
				
				for (int j = i; j < limite / i; j++) {
					primo[j*i]=true;
				}
			}
		}
		  for (int i = 2; i < limite; i++) { //imprime los numeros primos
			if(primo[i]==false) {
				lista.add(i);
			}
		}
	     
		  
		  
		return lista;

	}

}
