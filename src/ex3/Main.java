package ex3;

public class Main {

	public static void main(String[] args) {
		Repeater re = new Repeater();
		try {
			re.deposit(-1000);
		} catch (Exception e) {
			System.out.println("�Ա� �� ����");
			System.out.println("���� �Դϴ�.");
		}
	}

}
