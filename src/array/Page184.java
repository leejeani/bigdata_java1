package array;

import java.util.Random;

public class Page184 {

	public static void main(String[] args) {
		// 10���� �迭�� ���� �Ѵ�.
		// 1���� 99������ ������ ���ڸ� �迭�� �ִ´�.
		// �迭�� �հ� ����� ���Ͻÿ�.
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








