package Mysql;

import java.sql.*;

public class Database {
	
	public Connection conn;

	public Database(String host, String database, String user, String pass) {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn = DriverManager.getConnection("jdbc:mysql://"+host+"/"+database, user, pass);
			
			System.out.println("connexion réussie");
		}
		catch(SQLException e)
		{
			System.out.println("connexion échouée");
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
}
