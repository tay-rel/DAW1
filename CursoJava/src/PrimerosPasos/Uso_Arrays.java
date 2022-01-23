package PrimerosPasos;
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] mi_matriz=new int [5];
		//int mi_matriz2 []=new int[5]; otra opción de declarar
		mi_matriz [0]=5;
		mi_matriz [1]=38;
		mi_matriz [2]=-15;
		mi_matriz [3]=92;
		mi_matriz [4]=71;*/
		
		int [] mi_matriz= {5,38,-15,92,71,95,85,65,25,14,78};
		//Primera forma de hacer 
		//System.out.println(mi_matriz[0]);
		//System.out.println(mi_matriz[1]);
		//System.out.println(mi_matriz[2]);
		//System.out.println(mi_matriz[3]);
		//System.out.println(mi_matriz[4]);
		
		/*segunda forma de hacer con un for*/
		
		for(int i=0;i<mi_matriz.length;i++) {
			System.out.println("Valor del índidice " + i + " = " + mi_matriz[i]);
		
		}
		

	}
}
	
