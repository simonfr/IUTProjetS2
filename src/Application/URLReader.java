package Application;

import java.io.*;
import java.net.*;

public class URLReader {
	
	private String re = "";
	
    public URLReader(String url) throws Exception {

        URL oracle = new URL(url);
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        
        while ((inputLine = in.readLine()) != null)
            re += inputLine;
        in.close();
    }
    
    public String toString() {
    	return re;
    }
}