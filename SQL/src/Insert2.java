import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// codigo a ejecutar

		insertarContacto();

	}

	public static void insertarContacto() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection conn =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda","root", "ariel");//clase objeto de tipo coneccion
			Statement stmt=conn.createStatement();
			stmt.executeUpdate("INSERT INTO contactos(name , email) VALUES ('Federico','federico@gmail.com');");//se hace una insercion
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar algo
		}

	}

}
