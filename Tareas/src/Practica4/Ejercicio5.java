import java.util.Arrays;

public class Ejercicio5 {
	static char[] vector1= {'c','a','r','a','c','t','e','r'};
	static char[] vector2= {'c','a','r','a','c','t','e','r'};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
		
		
		System.out.println("\n"+"Resulta: "+compararVectores(vector1,vector2));
		
	}
	static int compararVectores(char vector1[],char vector2[]) {
		int contador=0;
		
			if(vector1.length<vector2.length) {
				contador += vector2.length;
			}else {
				contador+=vector2.length;
			}
			for(int i=0;i<contador;i++) {
				if(vector1[i]>vector2[i]) {
					return 1;
				}
				if(vector1[i]<vector2[i]) {
					return -1;
			}
		
		}
			return 0;

	}

}
