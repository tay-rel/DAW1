import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entry=new Scanner(System.in);
		System.out.print("Introduce un texto: ");
		
		String texto=entry.nextLine();
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < texto.length(); j++) {
				
				if(texto.charAt(j) != i) {
					System.out.print(banner(Character.toUpperCase(texto.charAt(j)), i)+" ");
				}
			}
			System.out.println(" ");
		}
		
		

	
	}
	static String banner(char letra, int numero) {
		return letras[letra -'A'][numero];
		
		

		
	}
	
	static String[][] letras= { //array

		 { "AAAAAAA", "A     A", "A     A", "AAAAAAA", "A     A", "A     A", "A     A" },
		 { "BBBBBB ", "B     B", "B     B", "BBBBBB ", "B     B", "B     B", "BBBBBB " },
		 { "CCCCCCC", "C      ", "C      ", "C      ", "C      ", "C      ", "CCCCCCC" },
		 { "DDDD   ", "D   DD ", "D    DD", "D     D", "D    DD", "D   DD ", "DDDD   " },
		 { "EEEEEEE", "E      ", "E      ", "EEEEEEE", "E      ", "E      ", "EEEEEEE" },
		 { "FFFFFFF", "F      ", "F      ", "FFFFFFF", "F      ", "F      ", "F      " },
		 { "GGGGGGG", "G      ", "G      ", "G  GGGG", "G     G", "G     G", "GGGGGGG" },
		 { "H     H", "H     H", "H     H", "HHHHHHH", "H     H", "H     H", "H     H" },
		 { "IIIIIII", "   I   ", "   I   ", "   I   ", "   I   ", "   I   ", "IIIIIII" },
		 { "JJJJJJJ", "   J   ", "   J   ", "   J   ", "   J   ", "   J   ", "JJJJ   " },
		 { "K     K", "K    K ", "K  K   ", "K K    ", "K   K  ", "K     K", "K     K" },
		 { "L      ", "L      ", "L      ", "L      ", "L      ", "L      ", "LLLLLLL" },
		 { "M     M", "MM   MM", "M M M M", "M  M  M", "M     M", "M     M", "M     M" },
		 { "N     N", "NN    N", "N N   N", "N  N  N", "N   N N", "N    NN", "N     N" },
		 { "OOOOOOO", "O     O", "O     O", "O     O", "O     O", "O     O", "OOOOOOO" },
		 { "PPPPPPP", "P     P", "P     P", "PPPPPPP", "P      ", "P      ", "P      " },
		 { " QQQQQ ", "Q     Q", "Q     Q", "Q     Q", "Q    Q ", "Q   QQ ", " QQQ  Q" },
		 { "RRRRRRR", "R     R", "R     R", "RRRRRRR", "R R    ", "R   R  ", "R     R" },
		 { " SSSSSS", "S      ", "S      ", " SSSSS ", "      S", "      S", "SSSSSS " },
		 { "TTTTTTT", "   T   ", "   T   ", "   T   ", "   T   ", "   T   ", "   T   " },
		 { "U     U", "U     U", "U     U", "U     U", "U     U", "U     U", "UUUUUUU" },
		 { "V     V", "V     V", "V     V", "V     V", " V   V ", "  V V  ", "   V   " },
		 { "W     W", "W     W", "W     W", "W  W  W", "W  W  W", " W W W ", "  WWW  " },
		 { "X     X", " X   X ", "  X X  ", "   X   ", "  X X  ", " X   X ", "X     X" },
		 { "Y     Y", " Y   Y ", "  Y Y  ", "   Y   ", "   Y   ", "   Y   ", "   Y   " },
		 { "ZZZZZZZ", " Z     ", "  Z    ", "   Z   ", "    Z  ", "     Z ", "ZZZZZZZ" } };

	

		
		
		
		
	
}


