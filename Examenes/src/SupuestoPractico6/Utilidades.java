package SupuestoPractico6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades {
	// Esta clase contiene metodos estaticos los cuales se utilizan para validar
	// datos

	// propiedades
	static String regexEmail = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	static String regexPassword = "(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&!?%]).{8,}";

	static String regexFecha = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/.])(0?[1-9]|1[1-2])\\1\\d{4}$";

	// Metodo que se utiliza para validar el email
	public static boolean validarEmail(String email) {
		if (email.matches(regexEmail)) {
			return true;
		}

		return false;
	}

	public static boolean validarPassword(String password) {
		if (password.matches(regexPassword)) {
			return true;
		}

		return false;
	}

	public static boolean validarFecha(String fecha) {

		return false;
	}

}
