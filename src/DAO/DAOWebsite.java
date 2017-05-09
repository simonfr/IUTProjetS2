package DAO;

import java.sql.*;

import Tables.Website;

public class DAOWebsite {
	
	Statement stmt;
	
	public DAOWebsite(Connection c) {
		try {
			stmt = c.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Website[] read() {
		Website Table[] = new Website[100];
		
		int i=0;
		
		try {
			ResultSet rs = stmt.executeQuery("select * from Website");
			
			while(rs.next()) {
				Table[i] = new Website(rs.getString("url"), rs.getString("brand"), rs.getString("model"), rs.getString("alternativeName"));
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return Table;
	}
	
}
