package big;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigInt {

	public static void main(String[] args) {
		int i = 2000000000;
		long l = 2000000000000000000L;
		
		BigInteger bi = 
			new BigInteger("20000000000000000000000");
		BigInteger bi2 
		    = bi.add(new BigInteger("30000000000"));
		double result = bi2.doubleValue();
		//System.out.println(result);
		
		double d = 100000000000000000000000000.11;
		String temp = d+"";
		BigDecimal bd = new BigDecimal(temp);
		System.out.println(bd);
		
	}

}






