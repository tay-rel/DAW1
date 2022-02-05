package Practica5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio12 {

	static String hour = "";
	static String minute = "";
	static String second = "";
	static String day = "";
	static String month = "";
	static String year = " ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hour: minute : second");
		System.err.println("La hora es: " + horaActual());
		
		System.out.println("day/month/year");
		System.err.println("Hoy es: "+fechaActual());

	}

	public static String horaActual() {

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		while (true) {
			hour = Integer.toString(c2.get(Calendar.HOUR));
			minute = Integer.toString(c2.get(Calendar.MINUTE));
			second = Integer.toString(c2.get(Calendar.SECOND));
			return hour +" : "+ minute +" : "+second;
		}
	}

	public static String fechaActual() {

		Calendar c1 = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();

		 day = Integer.toString(c2.get(Calendar.DATE));
		 month = Integer.toString(c2.get(Calendar.MONTH));
		 year = Integer.toString(c2.get(Calendar.YEAR));

		return day + "/" + month + "/" + year;
	}

}
