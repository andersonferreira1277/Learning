package sqlLite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteJDBC {

	public static Connection connect() {
		Connection c = null;
		
		try {
			Class.forName("org.sqlite.JDBC");
			String url = "jdbc:sqlite:teste.db";
			c = DriverManager.getConnection(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public static void criarTabela() {
		Connection c = connect();
		try {
			Statement stmt = c.createStatement();
			String sql = "CREATE TABLE COMPANY " + 
				"(ID INT PRIMARY KEY NOT NULL," + 
				" NAME TEXT	NOT NULL," +
				" AGE INT NOT NULL,"+
				" ADDRESS CHAR(50), " + 
				" SALARY REAL)";
			stmt.executeUpdate(sql);
			stmt.close();
			closeConnection(c);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void insert() {
		Connection c = connect();
		try {
			Statement stmt = c.createStatement();
			
			String sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
					"VALUES (1, 'Paul', 32, 'California', 20000.00 );";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
					"VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
					"VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
			stmt.executeUpdate(sql);
			
			sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
					"VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
			stmt.executeUpdate(sql);
			
			stmt.close();
			closeConnection(c);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void select() {
		Connection c = connect();
		
		try {
			Statement stmt = c.createStatement();
			c.setAutoCommit(false);
			String sql = "SELECT * FROM COMPANY;";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String address = rs.getString("address");
				float salary = rs.getFloat("salary");
				System.out.println( "ID = " + id );
				System.out.println( "NAME = " + name );
				System.out.println( "AGE = " + age );
				System.out.println( "ADDRESS = " + address );
				System.out.println( "SALARY = " + salary );
				System.out.println();
			}
			rs.close();
			stmt.close();
			closeConnection(c);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void update() {
		Connection c = connect();
		
		try {
			c.setAutoCommit(false);
			Statement stmt = c.createStatement();
			String sql = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
			stmt.executeUpdate(sql);
			c.commit();
			stmt.close();
			closeConnection(c);
			select();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void delete() {
		Connection c = connect();
		
		try {
			c.setAutoCommit(false);
			Statement stmt = c.createStatement();
			
			String sql = "DELETE from COMPANY where ID=2;";
			stmt.executeUpdate(sql);
			c.commit();
			
			stmt.close();
			closeConnection(c);
			
			select();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void closeConnection(Connection c) {
		try {
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
