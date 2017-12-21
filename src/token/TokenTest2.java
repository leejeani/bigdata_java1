package token;

import java.util.StringTokenizer;

public class TokenTest2 {

	public static void main(String[] args) {
		String str = "x=100*(200+300)/2";
		
		StringTokenizer st = 
				new StringTokenizer(str, "=*(+)/");
		while(st.hasMoreTokens()) {
			String result = st.nextToken();
			System.out.println(result);
		}
	}

}
