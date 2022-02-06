package  POO6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
		
		Coche [] vehiculos= new Coche[3];
	
		
		
		for (int i = 0; i < vehiculos.length; i++) {
			vehiculos[i]=new Coche();
			
			System.out.println("\nIntroduzca: ");
			System.out.print("Marca: ");
			vehiculos[i].marca=teclado.nextLine();
			System.out.print("Modelo: ");
			vehiculos[i].modelo=teclado.nextLine();
			System.out.print("Color: ");
			vehiculos[i].color=teclado.nextLine();
			
			System.out.print("Km: ");
			vehiculos[i].km=teclado.nextInt();
			teclado.nextLine(); //se pone aqui por que hay un bug despues de escribir un numero entero 
			
			System.out.print("Propietario: ");
			vehiculos[i].propietario=teclado.nextLine();
			
			
			
		}
		//LISTAR TODOS LOS VEHICULOS EN FORMATO "MARCA,MODELO,PROPIETARIO"
		System.out.println("\n\nTodos los vehiculos");
		
		for (int i = 0; i < vehiculos.length; i++) {
			/*System.out.println(vehiculos[i].marca+" "+vehiculos[i].modelo+" ("+vehiculos[i].propietario+") ");*/
			
			System.out.println(vehiculos[i].informacion());
			
		}
		
		
	}

}
