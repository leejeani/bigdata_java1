package car;

public class Game {

	public static void main(String[] args) {
		Car car = new Car();
		User user = new User("id01","이말숙",car);
		System.out.println(user);
		// 기름 5리터 넣고 
		user.getCar().setCurrFuelSize(5);
		
		// 5km를 달린다.
		user.getCar().go(5);
		
		System.out.println(user);
		
	}

}



