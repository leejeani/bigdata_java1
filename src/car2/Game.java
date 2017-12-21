package car2;

public class Game {

	public static void main(String[] args) {
		User user = new User("id02","이말자");
		Car cars[] = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();
		user.setCar(cars);
		
		// 사용자 정보와 
		// 사용자가 보유 하고 있는 자동차의 정보를 
		// 출력 하시오
		System.out.println(user);
		Car uCar [] = user.getCar();
		for(Car c:uCar){
			System.out.println(c);
		}

	}

}






