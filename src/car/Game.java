package car;

public class Game {

	public static void main(String[] args) {
		Car car = new Car();
		User user = new User("id01","�̸���",car);
		System.out.println(user);
		// �⸧ 5���� �ְ� 
		user.getCar().setCurrFuelSize(5);
		
		// 5km�� �޸���.
		user.getCar().go(5);
		
		System.out.println(user);
		
	}

}



