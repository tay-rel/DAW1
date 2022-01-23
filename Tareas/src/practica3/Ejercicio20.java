package practica3;
import java.util.Scanner;

public class Ejercicio20 {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entra=new Scanner(System.in);
		System.out.println(letras.length);
		System.out.println("Introduce un texto: ");
		
		String entrada=entra.nextLine().toUpperCase().trim();//para que lo convierta en mayuscula
		String texto="";
		
		for(int i=0;i<entrada.length();i++) {//recorre caracter
			if(entrada.charAt(i)!=' ') {
				
				texto += bannerLetra(entrada.charAt(i))+"\n";
				
				
		}	
	}
		System.out.println(texto);
		entra.close();
	}	
		static String bannerLetra(char letra) {		
		return	letras[letra-'A'];
			
		}
	static String[] letras= {
			
	"      A      \n"+
	"     A A     \n"+
	"    A   A    \n"+
	"   AAAAAAA   \n"+
	"  A       A  \n"+
	" A         A \n",
	
	 
	" BBBBBB \n"+
	" B     B\n"+
	" B     B\n"+
	" BBBBBB  \n"+
	" B     B\n"+
	" B     B\n"+
	" BBBBBB  \n",
	 
	 " CCCCCC \n"+
	 "C       \n"+
	 "C       \n"+
	 "C       \n"+
	 "C       \n"+
	 "C       \n"+
	 " CCCCCC \n",
	 
 	" DDDDDD    \n"+
 	"D       D   \n"+
 	"D        D \n"+
 	"D         D\n"+
 	"D        D\n"+
 	"D       D  \n"+
 	" DDDDDD    \n",
	};

}
