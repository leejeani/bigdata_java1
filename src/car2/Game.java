package car2;

public class Game {

	public static void main(String[] args) {
		User user = new User("id02","�̸���");
		Car cars[] = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();
		user.setCar(cars);
		
		// ����� ������ 
		// ����ڰ� ���� �ϰ� �ִ� �ڵ����� ������ 
		// ��� �Ͻÿ�
		System.out.println(user);
		Car uCar [] = user.getCar();
		for(Car c:uCar){
			System.out.println(c);
		}

	}

}






