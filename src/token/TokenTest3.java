package token;

import java.util.StringTokenizer;

public class TokenTest3 {

	public static void main(String[] args) {
		String s = 
		"1,捞富槛,康诀|2,全富磊,厚辑|3,沥富槛,包府";
		StringTokenizer st1 =
				new StringTokenizer(s,"|");
		while(st1.hasMoreTokens()) {
			String customer = st1.nextToken();
			StringTokenizer st2 = 
					new StringTokenizer(customer, ",");
			while(st2.hasMoreTokens()) {
				String data = st2.nextToken();
				System.out.print(data+" ");
				System.out.println("");
			} // end while
			System.out.println("-------------------");
		} // end while
	}

}






