package CadenaCaracteres;

/*String inmutables:Una vez creados en memoria no pueden ser alterados
 * ni se puede cambiar su valor */
public class String01 {
	static public void main(String[] args) {
		String s1 = new String("Hola");
		String s2 = "Mundo Java";

		System.out.println(s1); //hola
		System.out.println(s2);//Mundo java

		s1 = s1 + "-"; 
		s2 = s2.toUpperCase(); // Pasa a mayusculas 

		System.out.println(s1);//hola-
		System.out.println(s2);//MUNDO JAVA
		System.out.println(s1.concat(s2)); // Concatena dos cadenas.
		// Equivale a s1 + s2
		String s3 = s2;
	}
}