package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DATABASE {

	public User login(String username, String password) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/agenda", "root", "ariel");// clase
																													// //
																													// coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * From users where username='"+username+"' AND password='"+password+"';");

			boolean logged = false;
			User user = new User(); // todos los datos se mete en una variable de tipo obejto User
			while (rs.next()) { // si encuentra algo entra a while

				user.name = rs.getString("Nombre");
				user.nif = rs.getString("NIF");
				user.email = rs.getString("Email");
				user.address = rs.getNString("Direción");
				user.birthdate = rs.getNString("Fecha de nacimiento");
				user.role = rs.getString("user");

			}
			logged = true;

			stmt.close();
			conn.close();
			return user;
		} catch (Exception e) {
			System.out.println("ERROR: " + e); // Se usa un try/catch porque en la base de datos puede fallar algo
		}
		return null;

	}

}
