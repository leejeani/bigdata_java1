package array;

public class Page215 {

	public static void main(String[] args) {
		int a [][] = {
			{5,4,3,6,7},
			{9,8,7,6,5},
			{1,2,3,4,5},
			{9,8,7,6,5},
			{3,4,5,6,7}
		};
		int sum1 = 0;
		int sum2 = 0;
		// 1. 배열의 대각선의 합
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(i==j){
					sum1 += a[i][j];
				}
			}
		}
		// 2. 배열의 값이 짝수 일때의 합
		for(int [] temp:a){
			for(int data:temp){
				if(data%2==0){
					sum2 += data;
				}
			}
		}
		
		System.out.println(sum1);
		System.out.println(sum2);
	}

}




