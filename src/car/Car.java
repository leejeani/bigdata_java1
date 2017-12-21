package car;

public class Car {
	// variable
	private String name;
	private int size;         // ��ⷮ 
	private double fuelSize;     // �⸧�� ������
	private double currFuelSize; // ���� �⸧ ��
	
	// constructor
	public Car() {
		this.name = "basicCar";
		this.size = 500;
		this.fuelSize = 10;
		this.currFuelSize = 5;
	}
	
	public Car(String name, int size, double fuelSize, double currFuelSize) {
		this.name = name;
		this.size = size;
		this.fuelSize = fuelSize;
		this.currFuelSize = currFuelSize;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(double fuelSize) {
		this.fuelSize = fuelSize;
	}

	public double getCurrFuelSize() {
		return currFuelSize;
	}

	public void setCurrFuelSize(double currFuelSize) {
		if((this.currFuelSize+currFuelSize) > 
				fuelSize){
			System.out.println("��Ĩ�ϴ�..");
			return;
		}
		this.currFuelSize = 
				this.currFuelSize+ currFuelSize;
	}


	// toString
	@Override
	public String toString() {
		return "Car [name=" + name + ", size=" + size + ", fuelSize=" + fuelSize + ", currFuelSize=" + currFuelSize
				+ "]";
	}
	// operator
	
	// ���� �⸧��(currFuelSize)�� 
	// �������� ������ ���� �ִ� �Ÿ��� ����Ͽ�
	// ���� �Ѵ�.
	public double nextDistance(){
		double result = 0;
		if(this.size <= 1000){
			result = this.currFuelSize*10;	
		}else if(this.size <= 2000){
			result = this.currFuelSize*8.5;
		}else if(this.size <= 3000){
			result = this.currFuelSize*6.6;
		}
		return result;
	}
	
	public void stop(){
		System.out.println(this.name+" Stop !!!");
	}
	public void go(double distance){
		System.out.println(this.name+" Go !!!");
		// ��ⷮ 1000���ϸ� 1���ʹ� 10km ����.
		// ��ⷮ 2000���ϸ� 1���ʹ� 8.5km ����.
		// ��ⷮ 3000���ϸ� 1���ʹ� 6.6km ����.
		// ��ⷮ �� ���� �� �Ÿ� ��� 
		// �⸧ ���� �پ���.
		if(this.size <= 1000){
			if(distance/10 > this.currFuelSize){
				System.out.println("�⸧�� ���� �մϴ�.");
				return;
			}
			this.currFuelSize = 
					this.currFuelSize - distance/10;
		}else if(this.size <= 2000){
			if(distance/8.5 > this.currFuelSize){
				System.out.println("�⸧�� ���� �մϴ�.");
				return;
			}
			this.currFuelSize = 
					this.currFuelSize - distance/8.5;
		}else if(this.size <= 3000){
			if(distance/6.6 > this.currFuelSize){
				System.out.println("�⸧�� ���� �մϴ�.");
				return;
			}
			this.currFuelSize = 
					this.currFuelSize - distance/6.6;
		}
		
	}



	
	
	
}




