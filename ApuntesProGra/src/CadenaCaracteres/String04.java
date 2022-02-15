package CadenaCaracteres;
public class String04 {
	/* CONCATENACION DE CADENAS:El operador de concatenacion ,realmente no
	 * a�ade :genera nuevos objetos con la concatenacion*/
	static public void main(String[] args) {
		
		int edad = 20;
		String s1 = "Juan tiene " + edad + " a�os";
		System.out.println(s1);
		
		String s2 = new StringBuilder("Juan tiene ").append(edad).append(" a�os").toString();//toString convierte en String a StringBuilder
		System.out.println(s2);
		
		StringBuilder s3 = new StringBuilder("Juan tiene ");
		s3.append(edad).append(" años").toString();
		System.out.println(s3);
	}
}