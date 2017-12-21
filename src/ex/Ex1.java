package ex;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("Start");
		try{
			System.out.println("1");
			System.out.println(1/0);
			System.out.println("3");
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("4-1");
		}catch(Exception e){
			System.out.println("4-2");
		}finally{
			System.out.println("Finally");
		}
		System.out.println("End");
	}

}



