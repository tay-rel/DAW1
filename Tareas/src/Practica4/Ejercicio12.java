
package Practica4;import java.util.Arrays;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		System.out.println("Secuencia A");
		mostrar(secuenciaNaturalIntA(4));
		System.out.println("Secuencia B");
		mostrar(secuenciaNaturalIntB(4));
		System.out.println("Secuencia C");
		mostrar(secuenciaNaturalIntC(4));
		System.out.println("Secuencia D");
		mostrar(secuenciaNaturalIntD(4));
		
		
		
	}
	static void mostrar(int [][] recorrido) {
		
		for (int i = 0; i < recorrido.length; i++) {
			for (int j = 0; j < recorrido.length; j++) {
				System.out.print(" "+recorrido[i][j]);
			}
			System.out.print("\n");
		}
	
		

	}

	static int[][] secuenciaNaturalIntA(int n) {

		int[][] matriz = new int[n][n];
		int contador = 1;

		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz.length;j++) {
				matriz[j][i] = contador;
				contador++;
			}
		}
		return matriz;
	}


	static int[][] secuenciaNaturalIntB(int n) {

		int[][] matriz = new int[n][n];
		int contador= 1,orden = 0;

		for (int x = 0; x < matriz.length; x++) {
			if (orden == 0) {
				for (int y = 0; y < matriz.length; y++) {// Por columna de arriba-abajo
					matriz[y][x] = contador;
					contador++;
				}
				orden--;
			} else {
				for (int y = matriz.length - 1; y >= 0; y--) {// Por columna de abajo-arriba
					matriz[y][x] = contador;
					contador++;
				}
				orden++;
			}
		}
		return matriz;

	}

	
	static int[][] secuenciaNaturalIntC(int n) {

		int[][] matriz = new int[n][n];
		int contador = 1;

		for (int i = 0; i < matriz.length; i++) {
				int numeroRestar = -i - 1;
				int coordenadasY = 0;
			for (int j = 0; j <= i; j++) {
				matriz[matriz.length + numeroRestar][coordenadasY] = contador;
				numeroRestar++;
				coordenadasY++;
				contador++;
			}
		}
		int aux = 0;
		int numEjecucion2Bucle = n - 1;

		for (int i = 0; i < n - 1; i++) {

			aux++;
			int coordenadasY = aux;
			int coordenadasX = 0;

			for (int j = 0; j < numEjecucion2Bucle; j++) {

				matriz[coordenadasX][coordenadasY] = contador;

				coordenadasX++;
				coordenadasY++;
				contador++;
			}
			numEjecucion2Bucle--;
		}

		return matriz;
	}


	static int[][] secuenciaNaturalIntD(int n) {

		int[][] matriz = new int[n][n];

		int a = 0; // punto incio
		int b = n - 1; // punto final
		int contador = 1;
		int casoEjecutar = 0;

		while (contador <= n * n) {
			switch (casoEjecutar) {
			
			case 0:
				for (int i = a; i <= b; i++) {// ARRIBA-ABAJO

					matriz[i][a] = contador;
					contador++;
				}
				a++;
				casoEjecutar++;
				break;
			
			case 1:
				for (int i = a; i <= b; i++) {// IZQUIERDA-DERECHA

					matriz[b][i] = contador;
					contador++;
				}
				a--;
				b--;
				casoEjecutar++;
				break;

			case 2:
				for (int i = b; i >= a; i--) {// ABAJO-ARRIBA

					matriz[i][b + 1] = contador;
					contador++;
				}
				a++;
				casoEjecutar++;
				break;
	
			case 3:
				for (int i = b; i >= a; i--) {// DERECHA-IZQUIERDA

					matriz[a - 1][i] = contador;
					contador++;
				}
				casoEjecutar = 0;
				break;
			}

		}
		return matriz;
		
		
	}
}
