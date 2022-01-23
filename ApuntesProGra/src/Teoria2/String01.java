package Teoria2;
public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []palabras= {"Hola","esto","es","suma","cadena"};
		
		mostrarPalabras(palabras);
		
	}
	static void mostrarPalabras(String[] palabras) {
		String serie="";
		
		for(int i=0; i<palabras.length; i++) { //la propiedad length indica la cantidad
			serie +=palabras[i]+" ";
			
			
			
		}
		System.out.println(serie.trim());
		
	}

}
