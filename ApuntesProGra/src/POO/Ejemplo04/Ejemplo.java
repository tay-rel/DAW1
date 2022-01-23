package POO.Ejemplo04;


public class Ejemplo {
	public static void main(String[] args) {
		/* En este ejemplo no es necesario crear un objeto de clase Info
		 * ya que sus propiedades son estaticas y podemos leerlas
		 * directamente llamando al nombre de la clase*/
		
		// Mostrar mensaje de bienvenida
		System.out.println(Info.bienvenida);
		
		// Mostrar un valor estatico
		System.out.println("El valor estatico de Info es: " + Info.valor);
		
		// Mostrar mensaje de despedida
		System.out.println(Info.despedida);
	}
}