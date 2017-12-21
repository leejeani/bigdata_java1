package ex1;

import exception.MinusException;
import exception.OverFlowException;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(50,10);
		try {
			car.setOil(-1);
		} catch (OverFlowException e) {
			System.out.println(e.getMessage());
		} catch (MinusException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(car);
	}

}
