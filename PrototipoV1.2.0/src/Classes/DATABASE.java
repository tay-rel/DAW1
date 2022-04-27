package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DATABASE {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:33060/labyrinth";
	private static final String user = "root";
	private static final String pass = "ariel";

	public static String plantilla = "INSERT INTO users(username,password, name, nif, email, address, birthdate) VALUES ('<<Username>>','<<Password>>','<<Nombre>>', '<<NIF>>', '<<Email>>', '<<Direccion>>', '<<Fecha de Nacimiento>>');";

	public static boolean singUp(String username, String password, String name, String nif, String email,
			String address, String birthdate) {

		/*
		 * COMPRUEBA:System.out.println(
		 * "INSERT INTO users(username,password, name, nif, email, address, birthdate) VALUES ('<<Username>>','<<Password>>','<<Nombre>>', '<<NIF>>', '<<Email>>', '<<Direccion>>', '<<Fecha de Nacimiento>>');"
		 * );
		 */

		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase objeto de tipo coneccion
			// User user = new User();
			Statement stmt = conn.createStatement();
			// String encrypt = Utils.getMD5(password);

			String query = plantilla.replaceAll("<<Username>>", username)
					.replaceAll("<<Password>>", Utils.getMD5(password)).replaceAll("<<Nombre>>", name)
					.replaceAll("<<NIF>>", nif).replaceAll("<<Email>>", email).replaceAll("<<Direccion>>", address)
					.replaceAll("<<Fecha de Nacimiento>>", Utils.formatDateSQL(birthdate));

			stmt.executeUpdate(query);// se hace una insercion
			stmt.close();
			conn.close();

			return true;
		} catch (Exception e) {
			System.out.println("ERROR: " + e); // SE usa un try/catch porque en la base de datos puede fallar EN algo
			Log.addLines("Registro erroneo", username);
			return false;

		}

	}

	public static User login(String username, String password) {

		// Comprueba: System.out.println("SELECT * FROM users WHERE username='" +
		// username + "' AND password='" + password + "';");

		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase
																			// //
																			// coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "';");

			while (rs.next()) { // si encuentra algo entra a while
				User user = new User(); // todos los datos se mete en una variable de tipo objeto User
				user.id = rs.getInt("id");
				user.username = rs.getString("username");
				user.name = rs.getString("name");
				user.nif = rs.getString("nif");
				user.email = rs.getString("email");
				user.address = rs.getString("address");
				user.birthdate = rs.getString("birthdate");
				user.role = rs.getString("role");

				return user;
			}

			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.err.println("ERROR: " + e); // Se usa un try/catch porque en la base de datos puede fallar algo
		}
		return null;

	}

	public static boolean chekUser(String username) {
		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase
																			// //
																			// coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username='" + username + "';");

			while (rs.next()) { // si encuentra algo entra a while
				return true;
			}

			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.err.println("ERROR: " + e); // Se usa un try/catch porque en la base de datos puede fallar algo
		}
		return false;
	}

	public static boolean chekNif(String NIF) {
		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase
																			// //
																			// coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE nif='" + NIF + "';");

			while (rs.next()) { // si encuentra algo entra a while
				return true;
			}

			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.err.println("ERROR: " + e); // Se usa un try/catch porque en la base de datos puede fallar algo
		}
		return false;
	}

	public static boolean chekEmail(String email) {
		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase
																			// //
																			// coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE email='" + email + "';");

			while (rs.next()) { // si encuentra algo entra a while
				return true;
			}

			stmt.close();
			conn.close();

		} catch (Exception e) {
			System.err.println("ERROR: " + e); // Se usa un try/catch porque en la base de datos puede fallar algo
		}
		return false;
	}
}
