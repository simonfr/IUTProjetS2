package Application;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	private Regex(String regex, String text, String Table[][]) {
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
	
		int i=0;
		
		while(m.find()) {
			for(int count=1; count<m.groupCount(); count++) {
				Table[i][count] = m.group(count);
			}
			i++;
		}
	}
	
}
