package obj;

public class Ex6 {

	public static void main(String[] args) {
		String str = "leejean@tonesol.com";
		// ID와 DOMAIN을 출력 하시오
		String id = "";
		String domain = "";
		id = 
		str.substring(0,str.lastIndexOf('@'));
		domain = 
		str.substring(str.lastIndexOf('@')+1,
				      str.lastIndexOf('.'));
		System.out.println(id+" "+domain);
		
		
		System.out.println(str.lastIndexOf('@'));
		System.out.println(str.lastIndexOf('.'));
		
		String animals = "a-b-c-d";
		String ani [] = animals.split("-");
		for(String s : ani){
			System.out.println(s);
		}
		
		String str2 = "abcdef";
		
		System.out.println(str2.length());
		String str3 = str2.substring(3);
		String str4 = str2.substring(2, 4);
		
		System.out.println(str3);
		System.out.println(str4);
		
		String str5 = "    abvccc     ";
		String str6 = str5.trim();
		System.out.println("|"+str6+"|");
		
		
		int i = 10;
		String si = String.valueOf(i);
		String si2 = i+"";
		System.out.println(i+si+si2);
		System.out.println(i+
				Integer.parseInt(si)+
				Integer.parseInt(si2) );
	}

}










