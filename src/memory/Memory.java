package memory;

public class Memory {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		a = a + b;
		
		double d = a * 1.0;
		
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
		if(str1 == str3){
			System.out.println("1. str1 == str3");
		}
		str3 = "efg";
		if(str1 == str3){
			System.out.println("2. str1 == str3");
		}
		
		
	}

}



