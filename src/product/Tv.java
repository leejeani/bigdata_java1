package product;

public class Tv extends Product {
	Tv(){
	  super(100);
	}

	@Override
	public String toString() {
		return "Tv [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}

	@Override
	public void turnOn() {
		plugin();
		System.out.println("TV Turn On ...");
	}

	@Override
	public void turnOff() {
		System.out.println("TV Turn Off ...");		
	}
	
}
