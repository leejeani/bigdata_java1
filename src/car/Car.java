package car;

public class Car {
	private int serial;
	private String name;
	private static int count;
	
	// Class Variable initialization
	// 1�� ����
	static{
		System.out.println("Static Variable...");
		count = 100;
	}
	
	{
		System.out.println("Variable...");
		this.serial = count;
		count = count + 1;
	}
	
	public Car() {
		this("BASIC_CAR");
	}

	public Car(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "Car [serial=" + serial + ", name=" + name + "]";
	}
	
}
