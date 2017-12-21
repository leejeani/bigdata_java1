package obj;

public class Ex3 {

	public static void main(String[] args) {
		Value v1 = new Value(100, new Point(10));
		Value v2 = v1.clone();
		
		if(v1.p == v2.p){
			System.out.println("v1.p == v2.p");
		}
		v2.p.x = 200;
		System.out.println(v1);
		System.out.println(v2);

	}

}



