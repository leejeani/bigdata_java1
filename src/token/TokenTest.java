package token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str = "70,20,10,60,50";
		// 오름차순으로 정렬 하여 출력 하시오
		
		StringTokenizer st = 
				new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String result = st.nextToken();
			System.out.println(result);
		}
		
		String strArray[] = str.split(",");
		System.out.println(Arrays.toString(strArray));
		
		int intData [] = new int[strArray.length];
		for(int in=0;in<strArray.length;in++) {
			intData[in]  
				= Integer.parseInt(strArray[in]);
		}
		Arrays.sort(intData);
		
		System.out.println(Arrays.toString(intData));
		System.out.println(intData[0]);
		System.out.println(intData[intData.length-1]);
	}

}







