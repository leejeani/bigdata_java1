package car;

public class Cartest {

	public static void main(String[] args) {
		Car car = 
			new Car("k1", 1000, 80, 10);
		System.out.println(car);
		car.go(63);
		System.out.println(car);
		car.setCurrFuelSize(10);
		System.out.println(car);
		// 현재 기름 양으로
		// 앞으로 몇 키로를 달리수 있는지 표시하라
		double next = car.nextDistance();
		System.out.println("잔여거리:"+next);
		
	}

}


