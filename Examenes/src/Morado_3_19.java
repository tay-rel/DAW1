import java.util.Scanner;

public class Morado_3_19 {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		String text = "";
		
		while(true) {
			try {
				System.out.print("Introduce un texto: ");
				text = input.nextLine();
				
				break;
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("Dato erroneo introducido.\n");
				input.next();
			}
		}
		
		while(true) {
			try {
				System.out.println("1. Caracteres. \n2. Palabras. \n3. Lineas.\n");
				System.out.print("Opcion a mostrar: ");
				int op = input.nextInt();
				input.nextLine();
				
				interpretarCodigo(contarCaracteresPalabrasLineas(text), op);
				
				boolean exit = questionExit();
				
				if(exit) {
					break;
				}
			}
			catch(java.util.InputMismatchException e) {
				System.out.println("Dato erroneo introducido.\n");
				input.next();
			}
		}
	}
	
	static String contarCaracteresPalabrasLineas(String text) {
		int characters = text.replaceAll("\\s+", "").replace("\n", "").replace("\t", "").replace("\\n", "").replace("\\t", "").length();
		
		String[] textFormat = text.replaceAll("\\s+", ",").replaceAll("\\n", "").replaceAll("\\t", "").split(","); 
		int words = textFormat.length;
		
		
		String[] textLines = text.replace("\\n", "\n").split("\r\n|\n|\r");
		int lines = textLines.length;
		
		return "00" + characters + "-" + "00" + words + "-" + "00" + lines;
	}
	
	static void interpretarCodigo(String code, int option) {
		String[] codes = code.split("-");
		
		switch(option) {
			case 1:
				System.out.println(codes[0]);
				break;
			case 2:
				System.out.println(codes[1]);
				break;
			case 3:
				System.out.println(codes[2]);
				break;
		}
	}
	
	static boolean questionExit() {
		boolean exit = false;
		while(true) {
			System.out.print("\n¿Quires volver atras? S/N: ");
			String op = input.nextLine();
			
			if(op.equalsIgnoreCase("S")) {
				System.out.println();
				break;
			}
			else if(op.equalsIgnoreCase("N")) {
				System.out.println("Operación finalizada.");
				exit = true;
				break;
			}
			else {
				System.out.println("Opción desconocida. Vuelvelo a intentar.\n");
			}
		}
		
		if(exit) {
			return exit;
		}
		else {
			return exit;
		}
	}

}
