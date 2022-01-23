package Teoria2;
public class USO_arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros= {2,5,4,6,7};
		mostrarArrays(numeros);

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
