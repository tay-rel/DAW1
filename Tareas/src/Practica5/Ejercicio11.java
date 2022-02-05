package Practica5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio11 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("day/month/year");
		System.err.println("Hoy es: "+fechaActual());

	}

	public static String fechaActual() {
		
		Calendar c1=Calendar.getInstance();
		Calendar c2= new GregorianCalendar();
		
		String day=Integer.toString(c2.get(Calendar.DATE));
		String month=Integer.toString(c2.get(Calendar.MONTH));
		String year=Integer.toString(c2.get(Calendar.YEAR));
		
		
		
		return day+ "/"+month+"/"+year;
	}

}
