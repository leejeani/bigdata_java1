package obj;

public class Obj{
	int a;
	int b;
	public Obj(){
		System.out.println("Obj Default Constructor");
		b++;
	}
	public Obj(int a) {
		this.a = a;
		System.out.println("Obj Arg Constructor");
	}
	
	
}
