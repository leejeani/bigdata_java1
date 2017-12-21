package array;

import java.util.Random;

public class Page184 {

	public static void main(String[] args) {
		// 10개의 배열을 생성 한다.
		// 1부터 99까지의 랜덤한 숫자를 배열에 넣는다.
		// 배열에 합과 평균을 구하시오.
		int sum = 0;
		double avg = 0.0;
		
		int arr [] = null;
		arr = new int[10];

		Random random = new Random();
		for(int i=0; i<arr.length; i++){
			arr[i] = random.nextInt(99)+1;
			System.out.printf("%d\t",arr[i]);
		}
		
		for(int tmp:arr){
			sum += tmp;
		}
		
		avg = sum*1.0 / arr.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
	}

}








