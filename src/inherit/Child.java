package inherit;

public class Child extends Parent{
	int x = 200;
	public int getX(){
		return this.x;
	}
	public void method(){
		System.out.println("Child method");
		System.out.println("x:"+x);
		System.out.println("super.x:"+super.x);
		System.out.println("this.x:"+this.x);
	}
}
