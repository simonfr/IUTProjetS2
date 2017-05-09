package Application;

import java.sql.SQLException;

import DAO.DAOMarque;
import Mysql.Database;

public class Application {
	
	public static void main(String[] args) {
		Database db = new Database("localhost", "Badaboum", "root", "");
		
		try {
			InfuseBrands ib = new InfuseBrands(db.getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
