package array;

public class Page176 {

	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6,7,8,9,10};
		// �迭�� 4�� ��� �ڸ��� ���� ���Ͻÿ�
		int sum = 0;
		for(int i=0;i<ar.length;i++){
			if((i+1)%4 == 0){
				sum += ar[i];
			}
		}
		System.out.println(sum);
		
	}

}
