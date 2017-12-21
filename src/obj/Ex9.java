package obj;

public class Ex9 {

	public static void main(String[] args) {
		String s = new String("abc");
		String s2 = s.toUpperCase();
		StringBuffer sb = new StringBuffer(10);
		sb.append("efg");
		System.out.println(s);
		System.out.println(sb+"|");
		
		StringBuffer sb1 = new StringBuffer("a");
		StringBuffer sb2 = new StringBuffer("a");
		if(sb1 == sb2){
			System.out.println("sb1 == sb2");
		}
		if(sb1.equals(sb2)){
			System.out.println("sb1.equals(sb2)");
		}
		if((sb1.toString()).equals(sb2.toString())){
			System.out.println("sb1.toString()).equals(sb2.toString()");
		}
	}

}




