package operator;

public class Page114 {

	public static void main(String[] args) {
		int a = 3;
		System.out.println(
			10 < a & 11 < a++ & 12 < a & 13 < a);
		System.out.println(a);
		
		char c = 'a';
		System.out.println(
			c=='i' | c=='a' | c=='m'
		);
		
		boolean bb = true;
		System.out.println(!bb);
		System.out.println(!(10>2));
	}

}




