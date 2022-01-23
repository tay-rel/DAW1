import java.util.Scanner;

public class Intentar_examen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);

		
		while(true) {
			int numero=entrada.nextInt();
			System.out.println(generaBarraHorizontal(numero));
		}
	
		
		
		
	}
	
	static String generaBarraHorizontal(int numero) {
		final int limite_superior=10;
		final int limite_inferior=-10;
		final String caracter_base="*";
		
		
		
		if(numero<=limite_superior && numero>=limite_inferior ){//para que se cumplan ambas condiciones
				
			if(numero>0) {
				return " "+"|"+generarBloqueCaracteres(numero, caracter_base);
			}else if(numero<0) {
				return generarBloqueCaracteres(numero, caracter_base)+" "+" |"+" ";
			}else {
				return " | ";
			}	
			
			
		}
		else {
			return "Fuera de Rango";
		}
		//muestra *
		
		

		
		
	}
	static String generarBloqueCaracteres(int numero,String caracter) {
		//genera*
		String caracter_M="";
		int positivo=numero*(-1);
		System.out.println(positivo);
		if(numero>0) {
			for(int i=0;i<numero;i++) {
				caracter_M+=caracter;
				//variable para guardar caracter *
			}
		
		}else {
			for(int i=0;i<positivo;i++) {
				caracter_M+=caracter;
			}
			
		}
		
		return caracter_M;//retorno el string creado
		
		
	}

}
