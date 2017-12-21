package oop;

public class Factory2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv("red", false, 0);
		System.out.println(tv1);
		tv1.channelUp(10);
		System.out.println(tv1);
		// 채널 다운을 수정 하시오
		// 1.음수가 들어가면 안된다.
		// 2.기존 채널에서 음수로 갈수는 없다. 
		tv1.channelDown(5);
		System.out.println(tv1);
	}

}



