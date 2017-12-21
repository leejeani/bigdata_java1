package car;

public class Car {
	// variable
	private String name;
	private int size;         // 배기량 
	private double fuelSize;     // 기름통 사이즈
	private double currFuelSize; // 현재 기름 양
	
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
			System.out.println("넘칩니다..");
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
	
	// 현재 기름양(currFuelSize)를 
	// 기준으로 앞으로 갈수 있는 거리를 계산하여
	// 리턴 한다.
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
		// 배기량 1000이하면 1리터당 10km 간다.
		// 배기량 2000이하면 1리터당 8.5km 간다.
		// 배기량 3000이하면 1리터당 6.6km 간다.
		// 배기량 별 진행 한 거리 대비 
		// 기름 양이 줄어든다.
		if(this.size <= 1000){
			if(distance/10 > this.currFuelSize){
				System.out.println("기름이 부족 합니다.");
				return;
			}
			this.currFuelSize = 
					this.currFuelSize - distance/10;
		}else if(this.size <= 2000){
			if(distance/8.5 > this.currFuelSize){
				System.out.println("기름이 부족 합니다.");
				return;
			}
			this.currFuelSize = 
					this.currFuelSize - distance/8.5;
		}else if(this.size <= 3000){
			if(distance/6.6 > this.currFuelSize){
				System.out.println("기름이 부족 합니다.");
				return;
			}
			this.currFuelSize = 
					this.currFuelSize - distance/6.6;
		}
		
	}



	
	
	
}




