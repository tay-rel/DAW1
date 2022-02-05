package Practica5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("fecha/mes/año ");

		int day = 29;
		int month = 2;
		int year = 2020;

		System.out.println("\n" + day + "/" + month + "/" + year);

		System.out.print(fechaValida(day, month, year));

	}

	public static boolean fechaValida(int day, int month, int year) {
		int maxDays = 0;

		if (month == 2) {
			if ((year % 4 == 0 && 100 != 0) || (year % 100 == 0 && 400 == 0)) {
				System.out.println("El año es biciesto");
				maxDays = 29;
			} else {
				System.out.println("El año no es biciesto");
				maxDays = 28;
			}
		} else if (month == 8) {
			System.out.println("La fecha es valida");
			maxDays = 31;
		} else {
			if (month % 2 != 0) {
				System.out.println("La fecha es valida");
				maxDays = 31;
			} else {
				System.out.println("La fecha es valida");
				maxDays = 30;
			}
		}

		if (day <= maxDays && month <= 12) {
			return true;
		} else {
			return false;
		}
	}

}
