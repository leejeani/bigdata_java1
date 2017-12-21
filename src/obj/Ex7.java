package obj;

public class Ex7 {

	public static void main(String[] args) {
		String str = "abcdefg";
		char c[] = str.toCharArray();
		// 다음과 같이 출력 하시오
		// GFEDCBA
		for(int i=c.length-1;i>=0;i--){
			System.out.print(
				String.valueOf(c[i]).toUpperCase());
		}
		
		String datas = "a,b,c,d,e,f,g";
		String d[] = datas.split(",");
		String ndatas = String.join("-", d);
		System.out.println(ndatas);
	}

}




