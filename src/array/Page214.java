package array;

import java.util.Random;

public class Page214 {

	public static void main(String[] args) {
		int arr2 [][] = new int[4][3];
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);

		Random random = new Random();
		
		for(int i=0; i< arr2.length; i++){
			for(int j=0; j<arr2[i].length; j++){
				arr2[i][j] = random.nextInt(9)+1; 
			}
		}
	
		for(int [] a:arr2){
			for(int data:a){
				System.out.print(data+" ");
			}
			System.out.println("");
		}
		
		// 합과 평균을 구하시오
		int sum = 0;
		double avg = 0.0;
		
		for(int [] a:arr2){
			for(int data:a){
				sum += data;
			}
		}
		avg = sum*1.0/(arr2.length * arr2[3].length);
		System.out.println("---------------------");
		System.out.println(sum);
		System.out.println(avg);
		
	}

}



