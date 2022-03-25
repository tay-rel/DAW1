import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Select2 {
	private static final String driver="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://127.0.0.1:3306/agenda";
	private static final String user="root";
	private static final String pass="ariel";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard= new Scanner(System.in);
		System.out.print("Introduce un nombre: ");
		String nombre=keyboard.nextLine();
		
		lanzarConsulta(nombre);
	}
	public static void lanzarConsulta(String nom) {
		try {
			Class.forName(driver);	
			Connection conn =DriverManager.getConnection(url,user,pass );//clase objeto de tipo coneccion
			Statement stmt=conn.createStatement();
			ResultSet rs =stmt.executeQuery("SELECT * FROM contactos WHERE name LIKE '%"+ nom + "%';");
			
			//boolean logged=false;  
			//si encuentra algo entra a while
			while(rs.next()) {
				System.out.println("Contacto "+ rs.getInt("id") + ": "
						+rs.getString("name")+" "+rs.getString("email")+" "+rs.getString("telefono"));
				
				//todos los datos se mete en una variable de tipo obejto User 
				//logged =true ;
				
			}
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar algo
		}
	}

}
