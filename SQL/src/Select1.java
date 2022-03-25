import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		lanzarConsulta();
	}
	public static void lanzarConsulta() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda","root", "ariel");//clase objeto de tipo coneccion
			Statement stmt=conn.createStatement();
			ResultSet rs =stmt.executeQuery("SELECT * FROM contactos;");
			
			while(rs.next()) {
				System.out.println("Contacto "+ rs.getInt("id") + ": "
						+rs.getString("name")+" "+rs.getString("email")+" "+rs.getString("telefono"));
			}
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar algo
		}
	}

}
