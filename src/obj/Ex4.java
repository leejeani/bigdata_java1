package obj;

public class Ex4 {

	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = null;
		try{
			v2 = Value.class.newInstance();
		}catch(Exception e){
			
		}
		Object obj = new Value().getClass();
		Object obj2 = Value.class;
		Object obj3 = null;
		try {
			obj3 = Class.forName("Value");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}



