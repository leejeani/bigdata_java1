package product;

public class Computer extends Product {
	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	@Override
	public void turnOn() {
		plugin();
		System.out.println("Computer Turn On ...");
	}

	@Override
	public void turnOff() {
		System.out.println("Computer Turn Off ...");		
	}
	public void playGame(){
		System.out.println("Play OverWatch");
	}
	
}













