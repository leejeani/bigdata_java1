package control;

import java.util.Random;

public class Ws2 {

	public static void main(String[] args) {
		int num = 0;
		Random random = new Random();
		num = random.nextInt(100)+1;
		
		if(9 < num && num < 100){
			for(int i=1; i<=num;i++){
				if(i%3 == 0){
					System.out.println(i);
				}
			}
		} // end if
		
	}

}








