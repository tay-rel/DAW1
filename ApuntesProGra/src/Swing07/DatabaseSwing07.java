package Swing07;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseSwing07 {
	public static final String plantilla = "SELECT * FROM  contactos WHERE name LIKE '%<nombre>%';";// usar
	// etiquetas
	private static final String url = "jdbc:mysql://127.0.0.1:3306/agenda";
	private static final String user = "root";
	private static final String pass = "ariel";

	public static ArrayList<Contacto> consulta(String nombre) {
		ArrayList<Contacto> lista= new ArrayList<Contacto>();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);// clase objeto de tipo coneccion
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM contactos;"; //Esto se da cuando el campo esta vacio
			if (nombre.length()>0) {
				query=plantilla.replaceAll("<nombre>", nombre);
			}
			//prueba por consola System.out.println(query);
			
			ResultSet rs= stmt.executeQuery(query);
			while(rs.next()) {
				Contacto contact=new Contacto(
						  rs.getInt("id")
						, rs.getString("name")
						, rs.getNString("email")
						, rs.getString("telefono"));
				lista.add(contact);
				
			}

			rs.close();
			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar algo
			return lista;
		}

		return lista;
	}
}
