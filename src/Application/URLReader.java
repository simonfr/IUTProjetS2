package Application;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;

public class URLReader {
	
	private String re = "";
	
    public URLReader(String url) throws Exception {

    	URLConnection connection = new URL(url).openConnection();
    	connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
    	connection.connect();
    	
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));

        String inputLine;
        
        while ((inputLine = in.readLine()) != null)
            re += inputLine;
        in.close();
    }
    
    public String toString() {
    	return re;
    }
}