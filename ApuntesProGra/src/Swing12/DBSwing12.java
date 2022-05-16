package Swing12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class DBSwing12 {
	private static final String url = "jdbc:mysql://r2d2.iescierva.net/instituto";
	private static final String user = "instituto";
	private static final String pass = "instituto";
	
	public static ArrayList<Profesor> consulta(String texto, int offset ) {
		ArrayList<Profesor> lista = new ArrayList<Profesor>();

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pass);// clase objeto de tipo coneccion
			Statement stmt = conn.createStatement();

			String query = "SELECT * FROM profesor INNER JOIN departamento ON profesor.cod_departamento = departamento.cod_departamento"; // Esto se da cuando el campo esta vacio
			if (texto.length() > 0) {// Construir el where
				query += buildWhere(texto);	//Aqui me devuelve
			}
			if(offset >=0) {
				query+= " LIMIT 5 OFFSET "+offset+" ";
			}
		

			query += ";"; // Cerramos la consulta
			System.out.println(query);

			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				lista.add(new Profesor(
						rs.getString("profesor.nombre"),//la refernciamos en tabla y el campo
						rs.getString("profesor.apellido1"),
						rs.getString("profesor.apellido2"),
						rs.getString("departamento.nombre")		//es una idfrente tabla
						)
					);

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
		String[] terminos = texto.split(" ");	//sacar todos los termino que hay en el texto con un espacio
		for (int i = 0; i < terminos.length; i++) { // De esta forma recorremos cada una de las palabras buscando un resultado
			if (terminos[i].length() > 0) {	//para comprobar si el termino contiene algo
				//buscamos por todos los campos 
				where += "(profesor.nombre LIKE '%" + terminos[i] + "%' OR ";
				where += "profesor.apellido1 LIKE '%" + terminos[i] + "%' OR ";
				where += "profesor.apellido2 LIKE '%" + terminos[i] + "%' OR ";
				where += "departamento.nombre LIKE '%" + terminos[i] + "%') ";

				if (i != terminos.length - 1) {//si es distinto el ultimo elemento ,le aumentamos un OR
					where += " OR ";
				}
			}
		}

		return where;
	}

}
