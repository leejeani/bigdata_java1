package array;

import java.util.Random;

public class Page185 {

	public static void main(String[] args) {
		// ��÷ ��ȣ
		int a[] = {1,2,3,4,5,6};
		// ����� ��ȣ
		int b[] = {4,5,6,7,8,9};

		// ��� ��ȣ�� ��÷ �Ǿ����� Ȯ�� �Ͻÿ�.
		int count = 0;
		for(int tmp:b){
			// for���� �̿��Ͽ� a �迭�� �� �Ѵ�.
			for(int i=0;i<a.length;i++){
				if(tmp == a[i]){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}





