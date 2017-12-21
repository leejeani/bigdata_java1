package ex3;

public class Main {

	public static void main(String[] args) {
		Repeater re = new Repeater();
		try {
			re.deposit(-1000);
		} catch (Exception e) {
			System.out.println("입금 중 오류");
			System.out.println("음수 입니다.");
		}
	}

}
