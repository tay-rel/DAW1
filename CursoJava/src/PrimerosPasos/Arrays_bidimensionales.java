package PrimerosPasos;
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//se pone dos corchetes por que es bidimensional
		//[a][b]
		
		
		int [][] matrix=new int[4][5];
		//lo importante es que esten todos con sus posiciones
		
		matrix[0][0]=15;
		matrix[0][1]=21;
		matrix[0][2]=18;
		matrix[0][3]=9;
		matrix[0][4]=15;
		
		matrix[1][0]=10;
		matrix[1][1]=52;
		matrix[1][2]=17;
		matrix[1][3]=19;
		matrix[1][4]=7;
		
		matrix[2][0]=19;
		matrix[2][1]=2;
		matrix[2][2]=19;
		matrix[2][3]=17;
		matrix[2][4]=7;
		
		matrix[3][0]=92;
		matrix[3][1]=13;
		matrix[3][2]=13;
		matrix[3][3]=32;
		matrix[3][4]=41;
		//System.out.println("Valor almacenado en la posición 2, 3 es:  "+matrix[2][3]);
		//usamos for anidados para poder contar ambas dimensiones
		for(int i=0; i<4;i++) {
			//para que nos de como tablas
			System.out.println();
			
			for(int j=0;j<5;j++) {
				System.out.print(matrix[i][j]+" ");
				
				
			}
			
		}
		
		

	}

}
