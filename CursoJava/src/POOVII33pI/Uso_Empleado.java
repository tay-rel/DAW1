package POOVII33pI;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos tres instancias de clase
		/*
		 * Empleado employee1=new Empleado("Juan Martinez", 85000, 1990, 12,
		 * 17);//instancio Empleado Empleado employee2=new Empleado("Paco Gomez", 95000,
		 * 1995, 06, 02); Empleado employee3=new Empleado("Maria Martin", 105000, 2002,
		 * 03, 15);
		 * 
		 * employee1.subeSueldo(5); employee2.subeSueldo(5); employee3.subeSueldo(5);
		 * 
		 * System.out.println("Nombre: "+employee1.getNombre()+"\nSueldo: "+employee1.
		 * getSueldo() +"\nFecha de Alta: "+employee1.getFecha());
		 * System.out.println("Nombre: "+employee2.getNombre()+"\nSueldo: "+employee2.
		 * getSueldo() +"\nFecha de Alta: "+employee2.getFecha());
		 * System.out.println("Nombre: "+employee3.getNombre()+"\nSueldo: "+employee3.
		 * getSueldo() +"\nFecha de Alta: "+employee3.getFecha());
		 */

		// Segunda forma de hacer

		Empleado[] myEmployee = new Empleado[3];
		myEmployee[0] = new Empleado("Juan Martinez", 85000, 1990, 12, 17);
		myEmployee[1] = new Empleado("Paco Gomez", 95000, 1995, 06, 02);
		myEmployee[2] = new Empleado("Maria Martin", 105000, 2002, 03, 15);
		for (Empleado i : myEmployee) {
			i.subeSueldo(5); // myEmployee[i].subeSueldo(5);
		}

		for (Empleado e : myEmployee) {
			System.out.println(
					"Nombre: " + e.getNombre() + "\nSueldo: " + e.getSueldo() + "\nFecha Alta: " + e.getFecha());
		}

		/*
		 * for (int i = 0; i < myEmployee.length; i++) { System.out.println("Nombre: " +
		 * myEmployee[i].getNombre() + "\nSueldo: " + myEmployee[i].getSueldo() +
		 * "\nFecha Alta: " + myEmployee[i].getFecha()); }
		 */
	}

}

class Empleado {
	// Propiedades
	private String nombre;
	private double sueldo;
	private Date fechaAlta;// Variable de tipo objeto

	// Constructor que recibe parametros

	public Empleado(String name, double salary, int year, int mounth, int day) {

		nombre = name;
		sueldo = salary;
		GregorianCalendar calendar = new GregorianCalendar(year, mounth - 1, day);
		fechaAlta = calendar.getTime();

	}

	public String getNombre() {// Metodo getter
		return nombre;
	}

	public double getSueldo() {// Metodo getter
		return sueldo;
	}

	public Date getFecha() {// Metodo getter
		return fechaAlta;
	}

	// sube un tanto por ciento el sueldo
	public void subeSueldo(double percent) {// metodo setter
		double increase = sueldo * percent / 100;
		sueldo += increase;
	}

}