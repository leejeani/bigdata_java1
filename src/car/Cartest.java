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
		// ���� �⸧ ������
		// ������ �� Ű�θ� �޸��� �ִ��� ǥ���϶�
		double next = car.nextDistance();
		System.out.println("�ܿ��Ÿ�:"+next);
		
	}

}


