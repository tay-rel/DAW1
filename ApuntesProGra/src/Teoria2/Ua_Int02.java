package Teoria2;
public class Ua_Int02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = {2,5,4,6,0,7,9,1,3,8};
		mostrarArrays(numeros);
		
		int[] numerosOrdenados=ordenarNumeros(numeros);
		
		System.out.println(numerosOrdenados);
		
		mostrarArrays(numeros);
		
		
		
	}//ordenar de mayor a menor los numeros
	
	static int[] ordenarNumeros(int [] numeros) {
		int aux;
		for(int i=0;i<numeros.length;i++) {
			for(int j=i;j<numeros.length;j++) {
				
				if(numeros[j]<numeros[i]) {
					aux=numeros[j];
					numeros[j]=numeros[j];
					numeros[i]=aux;
				}
			}
		}
		
		return numeros;

	}
	
	static void mostrarArrays(int [] numeros) {
		String serie="";
		
		for(int i=0; i<numeros.length; i++) { //la propiedad length indica la cantidad
			serie +=numeros[i];
			if(i<numeros.length-1) {serie +=",";}
			
		}
		System.out.println(serie);
	}

}
