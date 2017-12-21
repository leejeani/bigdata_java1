package array;

public class Page175 {

	public static void main(String[] args) {
		// 1~100까지의 숫자 중
		// 3의 배수이거나 5의 배수인 값의 합을 
		// 구하시오
		// 합의 값이 100이 넘으면 종료 하시오
		// 단 continue 문과 break문을 이용하시오

		int sum = 0;
		for(int i=1;i<=100;i++){
			if(i%3 == 0 || i%5 == 0){
				sum += i;	
			}
			if(sum > 100){
				break;
			}
		}
		System.out.println(sum);
		
	}

}




