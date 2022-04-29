package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

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

	public static boolean chekData(String data, String value) {
		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase
																			// //
																			// coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE " + data + "='" + value + "';");

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

	public static boolean updateData(User us, String option, String data) {
		if (data.equals("null")) {
			return false;
		}

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase coneccion
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("UPDATE users SET " + option + "='" + data + "' WHERE id='" + us.id + "';");

			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			System.err.println("ERROR: " + e); // Se usa un try/catch porque en la base de datos puede fallar algo
		}
		return false;
	}

	public static boolean deleteData(String value) {
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase coneccion
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("DELETE FROM users WHERE username='" + value + "';");

			stmt.close();
			conn.close();
			return true;

		} catch (Exception e) {
			System.err.println("ERROR: " + e); // Se usa un try/catch porque en la base de datos puede fallar algo
		}
		return false;
	}

	public static User loginCurrent(String username) {

		// Comprueba: System.out.println("SELECT * FROM users WHERE username='" +
		// username + "' AND password='" + password + "';");

		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE username='" + username + "';");

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

	public static boolean listAll() {

		System.out.println("SELECT username FROM users;");
		try {

			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, user, pass);// clase coneccion
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT username FROM users;");

			while (rs.next()) { // si encuentra algo entra a while
				/*
				 * User user = new User(); // todos los datos se mete en una variable de tipo
				 * objeto User user.username = rs.getString("username");
				 * System.out.println(user.username);
				 */

				ArrayList<String> users = new ArrayList<String>();

				users.add(rs.getString("username"));

				for (String u : users) {
					System.out.println(users);
				}

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
