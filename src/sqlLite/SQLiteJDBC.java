package sqlLite;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLiteJDBC {

	public static void main(String[] args) {
		Connection c = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite:teste.db";
			c = DriverManager.getConnection(url);
			System.out.println("Conectado");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
