package obj;

import java.util.Arrays;

public class Ex8 {

	public static void main(String[] args) {
		String str = "andBjKi0iu782ReEyte";
		// 대문자, 소문자,숫자를 
		// 각각의 배열을 만들어 넣으시오
		char upper[] = null;
		char lower[] = null;
		char num[] = null;
		
		char strs [] = str.toCharArray(); 
		int ucnt = 0;
		int lcnt = 0;
		int ncnt = 0;
		for(char c : strs){
			if('a' < c && c < 'z'){
				lcnt++;
			}
			if('A' < c && c < 'Z'){
				ucnt++;
			}
			if('0' < c && c < '9'){
				ncnt++;
			}
		}
		upper = new char[ucnt];
		lower = new char[lcnt];
		num = new char[ncnt];
		
		int u = 0;
		int l = 0;
		int n = 0;
		
		for(char c : strs){
			if('a' < c && c < 'z'){
				lower[l++] = c;
			}
			if('A' < c && c < 'Z'){
				upper[u++] = c;
			}
			if('0' < c && c < '9'){
				num[n++] = c;
			}
		}
		System.out.println(Arrays.toString(lower));
		System.out.println(Arrays.toString(upper));
		System.out.println(Arrays.toString(num));
		
		// 각 배열에서  
		// 최대 값과 최소 값을 출력 하시오
		
		char lmin = lower[0];
		char lmax = lower[0];
		
		for(char c:lower){
			if(c > lmax){
				lmax = c;
			}else if(c < lmin){
				lmin = c;
			}
		}
		
		System.out.println("lower[] "+lmin+" "+lmax);

		char umin = upper[0];
		char umax = upper[0];
		
		for(char c:upper){
			if(c > umax){
				umax = c;
			}else if(c < umin){
				umin = c;
			}
		}
		
		System.out.println("upper[] "+umin+" "+umax);
		
		char nmin = num[0];
		char nmax = num[0];
		
		for(char c:num){
			if(c > nmax){
				nmax = c;
			}else if(c < nmin){
				nmin = c;
			}
		}
		
		System.out.println("num[] "+nmin+" "+nmax);
		
		Arrays.sort(upper);
		Arrays.sort(lower);
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(lower));
		System.out.println(lower[0]+" "+lower[lower.length-1]);
		System.out.println(Arrays.toString(upper));
		System.out.println(upper[0]+" "+upper[upper.length-1]);
		System.out.println(Arrays.toString(num));
		System.out.println(num[0]+" "+num[num.length-1]);
		
		int a = 1000000;
		String fs = String.format("#,###", a);
		System.out.println(fs);
		
	}

}








