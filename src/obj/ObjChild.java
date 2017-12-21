package obj;

public class ObjChild extends Obj{

	public ObjChild() {
		b++;
		System.out.println("ObjChild Default Constructor");
		a++;
	}

	public ObjChild(int a) {
		super(a);
		System.out.println("ObjChild arg Constructor");
	}
	
	final public void a(){
		
	}
	public void a(int data){
		
	}
	
}





