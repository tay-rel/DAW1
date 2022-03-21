package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex29 {
	static String regexUsername = "^[A-Za-z]{3,}";
	static String regexNIF = "^[0-9]{8,8}[A-Za-z]$";
	static String regexName = "^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String texto="abc dfdg132fdg asdrabcty";
		 * System.out.println(texto.replaceAll("a", "AAA"));//sustituye las minusculas
		 */

		// validateUsername(regexUsername);
		System.out.println(validateUsername("Tayrel"));
		System.out.println(validateDni("45454542v"));
		System.out.println(validateName("Tay"));
	}

	public static boolean validateUsername(String username) {
		return username.matches(regexUsername);
	}

	public static boolean validateDni(String DNI) {

		return DNI.toUpperCase().matches(regexNIF);

	}

	public static boolean validateName(String name) {
		if (name.matches(regexName) && name.split(" ").length > 1) { //funciona como array y el nombre es el minimo  
			return true;
		}
		return false;
	}
}
