package control;

public class Page168 {

	public static void main(String[] args) {
		// while ���� �̿��Ͽ�
		// 1~100������ �հ� ����� ���Ͻÿ�
		// Ȧ���� �հ� ¦���� ���� ��� �Ͻÿ�
		int sum = 0;
		double avg = 0.0;
		int oddSum = 0;
		int evenSum = 0;
		
		int i = 1;
		while(i<=100){
			if(i%2 == 1){
				oddSum += i;
			}else{
				evenSum += i;
			}
			sum += i;
			i++;
		}
		avg = (double)sum/(i-1);
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println(avg);
	}
	

}
