package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Tables.Marque;

public class DAOMarque {

	Statement stmt;
	
	public DAOMarque(Connection c) throws SQLException {
		stmt = c.createStatement();
	}
	
	public void create(Marque m) {
		
	}
	
	public boolean exist(String column, String value) throws SQLException {
		boolean re = false;
		ResultSet rs = stmt.executeQuery("Select * from Marque where "+column+"='"+value+"'");
		
		while (rs.next()) {
			re = true;
		}
		
		return re;
	}
}
