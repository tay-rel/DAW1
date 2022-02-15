package CadenaCaracteres;

public class Ejercicio11 {
	
	//StringBuffer/ StringBuilder
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Concaten la cadena 's' a lacadena dentro del objeto*/
		System.out.println("Ejemplo 1\n----------");
		StringBuffer s =new StringBuffer("Quiero ser");
		s.append(" un ave!");
		System.out.println(s);
		
		/*Cambia un caracter por el indice dentro de la cadena objeto*/
		System.out.println("Ejemplo 2\n----------");
		StringBuffer s2 =new StringBuffer("Quiero ser");
		s2.setCharAt(8, (char) 'h');;
		System.out.println(s2);
		
		/*Elimina la subcadena dentro de la cadena de objeto */
		System.out.println("Ejemplo 3\n----------");
		StringBuffer s3 =new StringBuffer("Quiero ser");
		s3.delete(7, 10);
		System.out.println(s3);
		
		
		/*Inserta la subcadena dentro de la cadena de objeto */
		System.out.println("Ejemplo 4\n----------");
		StringBuffer s4 =new StringBuffer("Quiero ser");
		s4.insert(4, "'ta'");
		System.out.println(s4);
		
		/*Revierte la subcadena dentro de la cadena de objeto */
		System.out.println("Ejemplo 5\n----------");
		StringBuffer s5 =new StringBuffer("Quiero ser");
		s5.reverse();
		System.out.println(s5);
		
		/*Devuelve el valor del objeto */
		System.out.println("Ejemplo 6\n----------");
		StringBuffer s6 =new StringBuffer("Quiero ser");
		s6.toString();
		System.out.println(s6);
		
		
	}

}
