package CadenaCaracteres;
public class String02 {
	static public void main(String[] args) {
		char caracteres[] = {'M','u','n','d','o',' ','J','a','v','a'};
		String s = new String(caracteres,5,4);         // s es la cadena "Mundo Java"
		System.out.println(s); // Concatena dos cadenas.
	}
}