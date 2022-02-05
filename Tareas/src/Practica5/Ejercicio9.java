package Practica5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio9 {

		/*Ocultar datos mediante una clave para que no puedan ser interpretados
		 *  por los que no la tienen este sistema permite encriptar datos personales o financieros.*/
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String text = "Cantemos un grito de guerra a la madre elevemos la voz";
			String password = "grito";
			
			String encryptedWord = encriptar(text, password); // encrypt
			System.out.println(encryptedWord);
			
			//System.out.println(encriptar(encryptedWord, password)); // decrypt
		}

		public static String encriptar(String text, String password) {
			StringBuilder encryptedWord = new StringBuilder();
			
			for (int i = 0; i < text.length(); i++) {
				encryptedWord.append((char) (text.charAt(i) ^ password.charAt(i % password.length())));
			}
			return encryptedWord.toString();
	}

}
