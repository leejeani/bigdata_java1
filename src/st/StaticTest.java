package st;

public class StaticTest {
	static int a = 10;
	int b = 10;
	static{
		a++;
		System.out.println("static block");
	}
	{
		System.out.println("class block");
	}
	public static void f(){
		a++;
		System.out.println("Static Function f");
	}
	public void f2(){
		a++;
	}
}






