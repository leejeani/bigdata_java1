package operator;

public class Page86 {

	public static void main(String[] args) {
		int a = 9%2;
		System.out.println(a);
		
		double result = 11.8 * a;
		int result2 = (int)(result*2);
		
		System.out.println(result2);
		
		int b = 10;
		int c = 10;
		int result3 = ++b + c++;
		System.out.println(b+" "+c+" "+result3);
		
		int d = 10;
		//d++;
		//d = d + 1;
		d =+ 1;
		
	}

}



