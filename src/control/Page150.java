package control;

import java.util.Random;

public class Page150 {

	public static void main(String[] args) {
		// 1~10까지의 난수 발생 하시오
		
		int a = 0;
		int random = (int)(Math.random()*10+1);
		
		System.out.println(random);
		
		Random ran = new Random();
		// 1 ~ 45까지의 난수 발생
		System.out.println(ran.nextInt(45)+1);
		
	}

}








