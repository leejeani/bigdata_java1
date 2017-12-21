package casting;

public class Page74 {

	public static void main(String[] args) {
		byte a = 100;
		int b = a;
		
		int c = 100;
		byte d = (byte) c;
		System.out.println(d);
		
		float f = 10.223F;
		int e = (int) f;
		
		System.out.println(e);
		
		long balance = 200000;
		double rate = 5.88;
		
		long result = balance * (long)rate;
		
		System.out.println(result);
		
	}

}








