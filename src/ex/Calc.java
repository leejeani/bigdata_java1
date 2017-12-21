package ex;

public class Calc {
	public int div(int a, int b) 
			throws Exception{
		int result = 0;
		if(b == 0){
			throw new ArithmeticException();
		}
		System.out.println("calc function ....");
		result = a / b;
		return result;
	}
}
