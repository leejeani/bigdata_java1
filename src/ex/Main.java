package ex;

public class Main {

	public static void main(String[] args) {
		Calc cal = new Calc();
		int result = 0;
		try {
			result = cal.div(10, 0);
		} catch (Exception e) {
			System.out.println("alert ºÐ¸ð°¡ 0");
		}
		System.out.println(result);
	}

}
