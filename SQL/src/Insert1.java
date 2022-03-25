import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Insert1 {

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
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda","root", "ariel");//clase objeto de tipo coneccion
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("INSERT INTO contactos(name , email, telefono) VALUES ('"+ nom+"','" + email +"','"+tel +"');");//se hace una insercion
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar algo
		}

	}

}
