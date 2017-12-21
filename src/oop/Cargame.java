package oop;

public class Cargame {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1);
		Car car2 = new Car(10000);
		car2.setName("k2");
		car2.setColor("red");
		System.out.println(car2);
		
		String car1Color = car1.getColor();
		System.out.println("자동차 색은"+car1Color);
		
		car1.go();
		car2.go();
	}

}



