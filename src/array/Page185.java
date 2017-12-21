package array;

import java.util.Random;

public class Page185 {

	public static void main(String[] args) {
		// 당첨 번호
		int a[] = {1,2,3,4,5,6};
		// 사용자 번호
		int b[] = {4,5,6,7,8,9};

		// 몇개의 번호가 당첨 되었는지 확인 하시오.
		int count = 0;
		for(int tmp:b){
			// for문을 이용하여 a 배열과 비교 한다.
			for(int i=0;i<a.length;i++){
				if(tmp == a[i]){
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}





