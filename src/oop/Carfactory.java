package oop;

public class Carfactory {

	public static void main(String[] args) {
		Car cars[] = new Car[3];
		cars[0] = new Car(100, "k1", "red", 1000);
		cars[1] = new Car(100, "k2", "blue", 2000);
		cars[2] = new Car(100, "k3", "green", 3000);
		
		for(Car c:cars){
			System.out.println(c);
		}
		
		// 자동차들의 가격의 합과 평균을 구하시오
		int sum = 0;
		double avg = 0.0;
		for(Car c:cars){
			sum += c.getPrice();
		}
		avg = 1.0 * sum / cars.length;
		System.out.println(sum);
		System.out.println(avg);
	}

}





