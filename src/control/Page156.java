package control;

public class Page156 {

	public static void main(String[] args) {
		// 1~100까지의 숫자 중에서
		// 홀수의 합과 짝수의 합을 구하시오
		int oddSum = 0;
		int evenSum = 0;
		for(int i=1 ; i<=10 ; i++){
			if(i%2==0){
				// even
				evenSum += i;
			}else{
				//odd
				oddSum += i;
			}
		} // end for
		System.out.println(oddSum);
		System.out.println(evenSum);
		
	}

}




