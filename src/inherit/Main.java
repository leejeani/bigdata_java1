package inherit;

public class Main {

	public static void main(String[] args) {
		Parent c1 = new Child();
		System.out.println(c1.getX());
		c1.method();
		System.out.println("----------------------");
		Child c2 = new Child();
		System.out.println(c2.x);
		c2.method();
		
		
	}

}
