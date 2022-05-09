package Swing09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBSwing09 {
	private static final String url = "jdbc:mysql://r2d2.iescierva.net/instituto";
	private static final String user = "instituto";
	private static final String pass = "instituto";

	public static ArrayList<Alumno> consulta(String texto, String campoOrden) {
		ArrayList<Alumno> lista = new ArrayList<Alumno>();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);// clase objeto de tipo coneccion
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM alumno"; // Esto se da cuando el campo esta vacio
			if (texto.length() > 0) {// Construir el where
				query += buildWhere(texto);
			}
			if(campoOrden.length()>0) {
				query+=" ORDER BY "+campoOrden+" ";
			}
			

			query += ";"; // Cerramos la consulta
			System.out.println(query);

			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				lista.add(new Alumno(rs.getString("nre"), rs.getString("nombre"), rs.getString("apellido1"),
						rs.getString("apellido2"), rs.getString("dni"), rs.getString("email")));

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

	private static String buildWhere(String texto) {
		String where = " WHERE ";
		// Construiremos el where sabiendo cuantas palabras tenemos
		String[] terminos = texto.split(" ");
		for (int i = 0; i < terminos.length; i++) { // De esta forma recorremos cada una de las palabras
			if (terminos[i].length() > 0) {
				where += "nre LIKE '%" + terminos[i] + "%' OR ";
				where += "nombre LIKE '%" + terminos[i] + "%' OR ";
				where += "apellido1 LIKE '%" + terminos[i] + "%' OR ";
				where += "apellido2 LIKE '%" + terminos[i] + "%' OR ";
				where += "dni LIKE '%" + terminos[i] + "%' OR ";
				where += "email LIKE '%" + terminos[i] + "%' ";
				if (i != terminos.length - 1) {
					where += " OR ";
				}
			}
		}

		return where;
	}
}
