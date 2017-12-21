package control;

public class Page151 {

	public static void main(String[] args) {
		// 로또 등수를 입력 받는다.
		// 예) 3
		// 로또 당첨 금액을 난수로 발생 시킨다.
		// 10억 ~ 100억 
		long money = 
				(long)(Math.random()*10000000000L)+1;
		System.out.printf("%d",money);
		// 1등 50%
		// 2등 30%
		// 3등 10%
		// 4등 5만원
		// 당첨금을 출력 하는 프로그램을 Switch로
		// 구현 하시오
	}

}
