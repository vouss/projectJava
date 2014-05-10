package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteManagement {
	  public SQLiteManagement (String dbName) {
	    Connection con = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      con = DriverManager.getConnection("jdbc:sqlite:" + dbName);
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	    }
	    System.out.println("Opened database successfully");
	    Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			ResultSet rs = stmt.executeQuery( "SELECT * FROM BOOK;" );
			System.out.println(rs.getString("title"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  public static void main(String[] args) {
		SQLiteManagement test = new SQLiteManagement("F:\\Download\\library.db");
	}
}
