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
//	1) �ΰ��� ���ڸ� �����ϰ� 1 ~ 100��������
//	�߻� ��Ų��.
		Random random = new Random();
		num1 = random.nextInt(100)+1;
		num2 = random.nextInt(100)+1;
//	2) �ΰ��� ���� �� �ִ밪�� �ּҰ��� 
//	���Ѵ�.
		if(num1 > num2){
			max = num1;
			min = num2;
		}else{
			min = num1;
			max = num2;	
		}
//	3) �ּҰ� ���� �ִ밪 ������ �հ� �����
//	���Ͻÿ�
		int count = 0;
		for(int i=min;i<=max;i++){
			sum += i;
			count ++;
		}
		avg = sum / (count*1.0);
//	4) �հ� ����� ����Ѵ�. 
		System.out.println(num1+" "+num2);
		System.out.println(sum+" "+avg);
		
	}

}




