package Regex;
public class Regex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//elimina los espacios en blanco entre una letra
		//
		
		
		/*String regex = "(\\w)(\\s+)([\\.,])";
		System.out.println("Hola  , Esto está regular .".replaceAll(regex, "$1$3"));*/
		
		
		
		
		
		//como funciona el replace
		
		/*String texto="Hola me llamo David";
		System.out.println(texto.replace("David", "pepe"));
		*/
		
		
		
		
		
		//replace con array
		
		String texto="Hola<name>. Has ganado 1.000.000 euros";
		String[] names= {"David","Alberto","Laura"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(texto.replaceAll("<name>", names[i]));
		}
	}

}
