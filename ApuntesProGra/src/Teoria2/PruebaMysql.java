package Teoria2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PruebaMysql {

	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:33060/labyrinth";
	private static final String user = "root";
	private static final String pass = "ariel";

	public static void main(String[] args) {

		System.out.println("Connecting database...");
		try {
			Connection connection = DriverManager.getConnection(url, user, pass);

			System.out.println("Database connected!");
		} catch (SQLException e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
}