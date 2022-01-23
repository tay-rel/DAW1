package ATS_ejercicios;


public class Array43 {
//bucle for-each
	public static void main(String[] args) {

		String[]nombres= {"alejandro","Maria","Luisa","Juan","Marcisa","Luisa"};
		
		//mostramos el contenido con un for
		/*for(int i=0;i< nombres.length;i++) {//usamos el metodo length que devuelve la longitud o el numero de elementos
			System.out.println(nombres[i]);
		}*/
		
		//bucle for-each Sintaxis
		//tipo de dato -identificador: nombre de mi Array
		
		for(String i:nombres) {
			System.out.println("Nombre: "+i);
		}
		
		
		
		
		

	}

}
