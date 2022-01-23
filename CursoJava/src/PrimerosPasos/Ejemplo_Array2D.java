package PrimerosPasos;
public class Ejemplo_Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		double interes=0.10;
		
		double[][] saldo=new double[6][5];
		
		for(int i =0;i<6;i++) {
			
			saldo[i][0]=1000;
			//los valores son fijos
			acumulado=10000;
			//incrementa paulatinamente
			for(int j=1;j<5;j++) {
				//es j01 porque antes ya iniciamos en 0
			acumulado=acumulado+(acumulado*interes);
			saldo[i][j]=acumulado;
			
			}
			
			interes=interes+0.01;	
			
		}
		
		for(int z=0;z<6;z++){
			System.out.println();
			for(int h=0;h<5;h++) {
				//este metodo imprime con formato
				//para que nos ponga con dos decimales
				System.out.printf("%1.2f", saldo[z][h]);
				System.out.print(" ");
			}
			
		}

	}

}
