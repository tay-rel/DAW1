package Classes;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Utils {

	// propiedades
	static String regexEmail = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	static String regexPassword = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.+[$*-+&!?%]).{8,}";
	static String regexNIF = "^[0-9]{8,8}[A-Za-z]$";
	static String regexUsername = "^[A-Za-z]{3,9}";
	static String regexName = "^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$";

	// Metodo que se utiliza para validar el email
	public static boolean validateEmail(String email) {
		return email.matches(regexEmail) ? true : false;
	}

	public static boolean validatePassword(String password) {

		return password.matches(regexPassword) ? true : false;
	}

	public static boolean validateFecha(String date) {
		try {
			SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
			formatDate.setLenient(false);
			formatDate.parse(date);
		} catch (Exception e) {

			return false;
		}

		return true;
	}

	public static boolean validateUsername(String username) {
		return username.matches(regexUsername);
	}

	public static boolean validateName(String name) {
		if (name.matches(regexName) && name.split(" ").length > 1) { // funciona como array y el nombre es el minimo
			return true;
		}
		return false;
	}

	public static boolean validateDni(String DNI) {
		return DNI.toUpperCase().matches(regexNIF);

	}
}
