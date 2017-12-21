package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		String data [] = 
			{"ca","coa","caae",
			"count","abc","cAed","Cad"
			};
		Pattern p = Pattern.compile("c[a-z]*");
		
		for(String s: data) {
			Matcher m = p.matcher(s);
			if(m.matches()) {
				System.out.println(s);
			}
		}
					
	}

}





