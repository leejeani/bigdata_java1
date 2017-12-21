package operator;

public class Page112 {

	public static void main(String[] args) {
		//Primitive Type
		int a = 10;
		
		//Reference Type
		String s1 = new String("10");
		String s2 = "10";
		String s3 = new String("10");
		String s4 = "10";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s4);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
	}

}




