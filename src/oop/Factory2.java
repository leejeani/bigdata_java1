package oop;

public class Factory2 {

	public static void main(String[] args) {
		Tv tv1 = new Tv("red", false, 0);
		System.out.println(tv1);
		tv1.channelUp(10);
		System.out.println(tv1);
		// ä�� �ٿ��� ���� �Ͻÿ�
		// 1.������ ���� �ȵȴ�.
		// 2.���� ä�ο��� ������ ������ ����. 
		tv1.channelDown(5);
		System.out.println(tv1);
	}

}



