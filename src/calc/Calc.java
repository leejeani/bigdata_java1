package calc;

public class Calc {
	private int number = 2;

	
	public double calcAvg(int... args){
		double result = 0.0;
		int sum = 0;
		for(int i:args){
			sum += i;
		}
		result = 1.0*sum/args.length;
		return result;
	}
	public double calcAvg(double data []){
		double result = 0.0;
		double sum = 0.0;
		for(double d:data){
			sum += d;
		}
		result = sum/data.length;
		return result;
	}
	
	/**
	 * 이함수는 정수형 두개의수를 더하고 결과를 리턴
	 * @param a
	 * @param b
	 * @return a+b
	 */
	public int sum(int a,int b){
		int result = 0;
		result = a + b;
		return result;
	}
	// overloading
	public double sum(double a,double b){
		double result = 0.0;
		result = a + b;
		return result;
	}
	public double sum(double a,double b,double z){
		double result = 0.0;
		result = a + b;
		return result;
	}
	public int div(int a, int b){
		int result = 0;
		
		result = a / b;	
		
		return result;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}






