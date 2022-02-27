package SupuestoPractico6;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades {
	// Esta clase contiene metodos estaticos los cuales se utilizan para validar
	// datos

	// propiedades
	static String regexEmail = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	static String regexPassword = "(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&!?%]).{8,}";

	// Metodo que se utiliza para validar el email
	public static boolean validarEmail(String email) {
		return email.matches(regexEmail)?true:false;
	}

	public static boolean validarPassword(String password) {

		return password.matches(regexPassword)?true:false;
	}

	public static boolean validarFecha(String fecha) {
		try {
			SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
			formatoFecha.setLenient(false);
			formatoFecha.parse(fecha);
		} catch (Exception e) {
			
			return false;
		}

		return true;
	}

}
