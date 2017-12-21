package calc;

public class CalcView {

	public static void main(String[] args) {
		Calc cal = new Calc();
		cal.setNumber(5);
		int sumResult = cal.sum(10, 20);
		System.out.println(sumResult);
		
		int divResult = cal.div(10, 0);
		System.out.println(divResult);
		
		double sumResult2  = 
			cal.sum(1.0, 2.0);
		System.out.println(sumResult2);
		
		double datas [] = 
			{1.1,5.6,9.8,7.3,5.7};
		double result = 
				cal.calcAvg(datas);
		System.out.println(result);
		int a = 10;
		int b = 20;
		System.out.printf("출력 합니다. %d %d",a,b);
		
		double r1 = cal.calcAvg(1,2,3,4);
		double r2 = cal.calcAvg(1,2,3,4,5,6,7,8,9);
		
		System.out.println(r1);
		System.out.println(r2);
	}

}



