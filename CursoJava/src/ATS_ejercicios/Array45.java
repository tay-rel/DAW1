package ATS_ejercicios;
import java.util.Scanner;

public class Array45 {
	/*leer 5 numeros por teclado y lamacenarlos en un arreglo*/
	static float suma_positivos=0,suma_negativos=0,media_p,media_n;
	static int conteo_positivos=0,conteo_negativos=0,conteo_ceros=0;
	
	public static void main(String[] args) {
		
		float [] numeros =new float [5];
		
		System.out.println("Guarda numeros en el arreglo ");
		
		//media de los positivos
		
		Scanner entrada=new Scanner(System.in);
	
		
		for(int i=0;i<numeros.length;i++) {
			System.out.print((i+1)+"Digite un numero: ");
			numeros[i]=entrada.nextFloat();
			
				if(numeros[i]==0){
					conteo_ceros++;
					}else if(numeros[i]>0) {
						suma_positivos+= numeros[i];
						conteo_positivos++;
					}else {
						suma_negativos=suma_negativos+numeros[i];
						conteo_negativos++;
					}
					
		}
		
		
		if(conteo_positivos==0) {
			System.out.println("No se puede sacar la media de los numeros positivos");
			}else {
				media_p=suma_positivos/conteo_positivos;
				System.out.println("La media de los numeros positivos es: "+media_p);
			}
		
		if(conteo_negativos==0) {
			System.out.println("No se puede sacar la media de los numeros negativos");
			}else {
				media_n=suma_negativos/conteo_negativos;
				System.out.println("La media de los numeros negativos es: "+media_n);
		}
		System.out.println("La candidad de ceros es "+conteo_ceros);
		
	
	
		
		
	}

}
