package inner;

public class A {
	static int c = 20;
	int aa = 10;
	public class B{
		int b = 10;
		final static int c = 20;
	}
	public static class C{
		int c = 20;
		static int d = 30;
		//B b = new B();
		A a = new A();
		B b = a.new B();
	}
	public void a(){
		int aaa = 10;
		final int bbb = 20;
		aaa = aa;
		aaa = c;
		class D{
			int ad = 40;
			final static int ad2 = 20;
			int classD1 = aa;
			int classD2 = bbb;
		}
		System.out.println(D.ad2);
		System.out.println(new D().ad);
	}
	
	public static void main(String args[]){
		A a = new A();
		a.a();
	}
}










