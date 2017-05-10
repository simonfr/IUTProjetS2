package Application;

import java.sql.Connection;
import DAO.DAOMarque;
import DAO.DAOWebsite;
import Tables.Marque;
import Tables.Website;

public class InfuseBrands {
	
	Website ws[] = new Website[100];
	String[][] Brands = new String[1000][100];
	
	
	public InfuseBrands(Connection c) throws Exception {
		ws = new DAOWebsite(c).read();
		DAOMarque dm = new DAOMarque(c);
		
		int i=0;
		
		while(ws[i] != null) {
			new Regex(ws[i].getBrand(), new URLReader(ws[i].getUrl()).toString(), Brands);
			
			int j=0;
			
			while (Brands[j][2] != null) {
				if(!dm.exist("nom", Brands[j][2])) {
					dm.create(new Marque(Brands[j][2]));
					
					System.out.println("Marque "+Brands[j][2]+" ajoutée");
				}
	
				j++;
			}
			
			i++;
		}
		
	}
}
