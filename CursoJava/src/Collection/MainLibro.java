package Collection;

public class MainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro("P en java", "Juan", 25);
		Libro libro2 = new Libro("P en java", "Juan", 25);
		
		//libro1=libro2;//hace referencia al mismo objeto
		
		//equals no es capaz de distinguir si nuestros objetos son iguales
		if (libro1.equals(libro2)) {
			System.out.println("Es el mismo libro");
			System.out.print(libro1.hashCode()+"==");
			System.out.println(libro2.hashCode());
		} else {
			System.out.println("No es el mismo libro");
			
			System.out.print(libro1.hashCode()+"!=");
			System.out.println(libro2.hashCode());
		}
	}

}
