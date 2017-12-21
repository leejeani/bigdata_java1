package wrapper;

public class W1 {

	public static void main(String[] args) {
		Object objs [] = new Object[3];
		objs[0] = new String("100");
		objs[1] = 1;
		objs[2] = 1.2;
		
		for(Object obj: objs) {
			if(obj instanceof Integer) {
//				Integer i = (Integer)obj;
//				int temp = i.intValue();
//				temp += 100;
				int temp = (int)obj;
				System.out.println(temp);
			}
			//System.out.println(obj);
		}
		
		
		String str = "100";
		int i = Integer.parseInt(str); // 10Áø¼ö
		Integer in = 100;
		
		
	}

}



