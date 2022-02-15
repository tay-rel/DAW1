package CadenaCaracteres;

public class String10 {
	/*Extraccion de caracteres */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.print("Para extraer un unico carcater se usa charAt()=");
			String text= "abc";
			System.out.println(text.charAt(1));
			
			System.out.println("Para extraer más de un caracter a la vez se usa getChars()");
			String text2="Esto no es una canción";
			char buf[]=new char[2];
			text2.getChars(5, 7, buf, 0);					//buf ahora tendra el vaor "no"
			for (char temp : buf) {
				System.out.println(temp);
			}
			
	}

}
