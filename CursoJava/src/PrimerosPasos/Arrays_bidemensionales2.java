package PrimerosPasos;
public class Arrays_bidemensionales2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix= {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27}
				
		};
		//bucle for each
	for(int[]fila:matrix) {
		System.out.println();
		
		for(int z: fila) {
			System.out.print(z+" ");
		}
	}

	}

}
