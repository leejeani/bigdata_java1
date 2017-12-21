package obj;

public class Ex5 {

	public static void main(String[] args) {
		String str = new String("abc");
		System.out.println(str);
		String str2 = str.toUpperCase();
		String str3 = "ABC";
		String str4 = "ABC";
		System.out.println(str2);
		
		if(str4 == str3){
			System.out.println("str2 == str3");
		}
		
	}

}
