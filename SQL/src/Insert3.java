

import java.util.Scanner;

public class Insert3 {


	public static String plantilla ="INSERT INTO contactos(name, email, telefono) VALUES ('<<nombre>>', '<<email>>', '<<telefono>>');";//usar etiquetas

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// codigo a ejecutar
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Introduce un nombre: ");
		String nombre=keyboard.nextLine();
		
		System.out.println("Introduce un email: ");
		String email=keyboard.nextLine();
		
		System.out.println("Introduce un telefono: ");
		String telefono=keyboard.nextLine();
		
		
		insertarContacto(nombre, email, telefono);

	}

	public static void insertarContacto(String nom, String email, String tel) {
		boolean sucess=false;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda","root", "ariel");//clase objeto de tipo coneccion
			Statement stmt=conn.createStatement();
			
			String query=plantilla
					.replaceAll("<<nombre>>", nom)
					.replaceAll("<<email>>", email)
					.replaceAll("<<telefono>>", tel);
			
			stmt.executeUpdate(query);//se hace una insercion
			
			stmt.close();
			conn.close();
			sucess=true;
		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar algo
		}

	}

}
