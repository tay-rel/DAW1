package Regex;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex29 {
	static String regexUsername = "^[A-Za-z]{3,}";
	static String regexNIF = "^[0-9]{8,8}[A-Za-z]$";
	static String regexName = "^[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+(\\s*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]*)*[a-zA-ZÀ-ÿ\\u00f1\\u00d1]+$";
	static String day = "";
	static String month = "";
	static String year = " ";

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
		System.out.println(getMD5("1234"));
		System.out.println(validateFecha("1997-04-01"));
		System.out.println(getAge("2002/07/05"));
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
	
	public static String getMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);

			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public static boolean validateFecha(String date) {
		try {
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-d", Locale.getDefault());
			formatDate.setLenient(false);
			formatDate.parse(date);
		} catch (Exception e) {

			return false;
		}

		return true;
	}
	
	public static int getAge(String birthdate) {
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/d");
		LocalDate fechaNac = LocalDate.parse(birthdate, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		
		           return    periodo.getYears();
		
		
	}
	
		
	
	
}
