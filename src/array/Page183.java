package array;

import java.util.Random;

public class Page183 {

	public static void main(String[] args) {
		int arr [];       // declaration
		arr = new int[6]; // initialization
		
		Random random = new Random();

		// �迭�� ������ ���ڸ� �ִ´�.
		for(int i=0; i<arr.length; i++){
			arr[i] = random.nextInt(10)+1;
			if(i != 0){
				for(int j=0;j<i;j++){
					if(arr[j] == arr[i]){
						i--;
					}
				}
			}
		}

		// �迭�� ���� ��� �Ѵ�.
		for(int data:arr){
			System.out.println(data);
		}
	}

}




