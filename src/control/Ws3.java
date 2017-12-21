package control;

public class Ws3 {

	public static void main(String[] args) {
		// 3개의 주사위를 던져서 나올수 있는 
		// 경우를 모두 출력 하시오
		// 첫번째 주사위는 홀수 이고
		// 두번째 주사이는 짝수 일때의 
		// 눈의 합을 출력 하시오
		
		int count = 0;
		int count2 = 0;
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				for(int z=1;z<=6;z++){
					if(i%2==0 && j%2==1){
						count2++;
					}
					count++;
				}
			}
		}
		System.out.println("Result:"
		                    +100.0*count2/count);
	}

}


