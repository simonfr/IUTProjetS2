package Application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.DAOWebsite;
import Tables.Website;

public class InfuseBrands {
	
	public InfuseBrands(Connection c) throws Exception {
		
		Website ws[] = new DAOWebsite(c).read();
		String[][] Brands = new String[1000][100];
		
		int i=0;
		
		while(ws[i].getUrl() != null) {
			new Regex(ws[i].getBrand(), new URLReader(ws[i].getUrl()).toString(), Brands);
			
			
			
			i++;
		}
		
	}
	
}
