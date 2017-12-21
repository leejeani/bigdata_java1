package control;

public class Page159 {

	public static void main(String[] args) {
		// 1 ~ 3524까지의 평균을 구하시오
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		for(int i=1; i<=10; i++){
			sum += i;
			count++;
		}
		System.out.println(count);
		System.out.println("Sum:"+sum);
		avg = sum / (count*1.0);
		System.out.println("Avg:"+avg);
	}

}



