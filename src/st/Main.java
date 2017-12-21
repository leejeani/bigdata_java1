package st;

public class Main {

	public static void main(String[] args) {
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest.a = 100;
		System.out.println(StaticTest.a);
		StaticTest.f();
	}

}
