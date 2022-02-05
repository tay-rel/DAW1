package Practica5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio10 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("hour: minute : second");
		System.err.println("La hora es: "+horaActual());

	}

	public static String horaActual() {
		
		Calendar c1=Calendar.getInstance();
		Calendar c2= new GregorianCalendar();
		
		String hour=Integer.toString(c2.get(Calendar.HOUR));
		String minute=Integer.toString(c2.get(Calendar.MINUTE));
		String second=Integer.toString(c2.get(Calendar.SECOND));
		
		
		
		return hour+ ":"+minute+":"+second;
	}

}
