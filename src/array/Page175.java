package array;

public class Page175 {

	public static void main(String[] args) {
		// 1~100������ ���� ��
		// 3�� ����̰ų� 5�� ����� ���� ���� 
		// ���Ͻÿ�
		// ���� ���� 100�� ������ ���� �Ͻÿ�
		// �� continue ���� break���� �̿��Ͻÿ�

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




