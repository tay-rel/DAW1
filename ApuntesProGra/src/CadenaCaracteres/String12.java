package CadenaCaracteres;

public class String12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo 1\n-------");
		String saludo1= new String("Hola.");
		String saludo2=saludo1;
		if(saludo1.equals(saludo2)) {
			System.out.println(saludo2);//hola.
		}
		saludo1=saludo1.concat("de nuevo");//Hola.de nuevo
		
		if(saludo1.equals(saludo2)) {//Hola.de nuevo / hola son diferentes
			System.out.println(saludo1);
		}else {
			System.out.println(saludo2);//hola.
		}
		
		
		System.out.println("Ejemplo 2\n-------");
		String s="1";
		System.out.println(""+Integer.parseInt(s));
		
		System.out.println("Ejemplo 3\n-------");
		String s2="112";
		System.out.println(s2.substring(2));
		
		System.out.println("Ejemplo 4\n-------");
		String str1="Hola mundo java";
		String str2="Hola mundo";
		System.out.println(compareTo(str1,str2));
		
		System.out.println("Ejemplo 5\n-------");
		int n=4;
		String s3="Hola";
		String t="Mundo";
		String result=s3.substring(2, n);
		System.out.println(result);
	}
	public static int compareTo(String str1, String str2) {
		int lent1=str1.length();
		int lent2=str2.length();
		int limite=Math.min(lent1, lent2);//obtiene la longitud del menor
		int k=0;
		while (k<limite) {
			char c1=str1.charAt(k);
			char c2=str2.charAt(k);
			if(c1 != c2) {
				return c1-c2;
			}
			k++;
		}
		
		return lent1-lent2 ;
	}

}
