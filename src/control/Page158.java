package control;

import java.util.Random;

public class Page158 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int max = 0;
		int min = 0;
		int sum = 0;
		double avg = 0.0;
//	1) 두개의 숫자를 랜돔하게 1 ~ 100까지에서
//	발생 시킨다.
		Random random = new Random();
		num1 = random.nextInt(100)+1;
		num2 = random.nextInt(100)+1;
//	2) 두개의 숫자 중 최대값과 최소값을 
//	구한다.
		if(num1 > num2){
			max = num1;
			min = num2;
		}else{
			min = num1;
			max = num2;	
		}
//	3) 최소값 부터 최대값 까지의 합과 평균을
//	구하시오
		int count = 0;
		for(int i=min;i<=max;i++){
			sum += i;
			count ++;
		}
		avg = sum / (count*1.0);
//	4) 합과 평균을 출력한다. 
		System.out.println(num1+" "+num2);
		System.out.println(sum+" "+avg);
		
	}

}




