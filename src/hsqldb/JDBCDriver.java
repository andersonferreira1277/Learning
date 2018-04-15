package hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDriver {
	
	private static String url = "jdbc:hsqldb:file:db/teste";
	private static String user = "anderson";
	private static String password = "12345";
	
	public static void main(String[] args) {
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
