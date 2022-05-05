package Swing06;

import java.sql.*;

public class DatabaseSwing {
	public static final String plantilla = "INSERT INTO contactos(name, email, telefono) VALUES ('<<nombre>>', '<<email>>', '<<telefono>>');";// usar
																																				// etiquetas
	private static final String url = "jdbc:mysql://127.0.0.1:3306/agenda";
	private static final String user = "root";
	private static final String pass = "ariel";

	public static boolean guardarContacto(String nombreApellido, String email, String telefono) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);// clase objeto de tipo coneccion
			Statement stmt = conn.createStatement();

			String query = plantilla.replaceAll("<<nombre>>", nombreApellido)
									.replaceAll("<<email>>", email)
									.replaceAll("<<telefono>>", telefono);

			stmt.executeUpdate(query);// se hace una insercion

			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar algo
			return false;
		}

		return true;
	}

}
