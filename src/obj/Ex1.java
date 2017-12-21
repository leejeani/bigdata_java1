package obj;

public class Ex1 {

	public static void main(String[] args) {
		Value v1 = new Value(100);
		Value v2 = new Value(100);
		
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
		
		
		
		System.out.println(v1.toString());
		if(v1 == v2){
			System.out.println("v1 == v2");
		}else{
			System.out.println("v1 x v2");
		}
		
		if(v1.equals(v2)){
			System.out.println("v1.equals(v2)");
		}else{
			System.out.println("v1. not equals(v2)");
		}
	}

}



