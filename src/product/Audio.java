package product;

public class Audio extends Product {
	public Audio() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	@Override
	public void turnOn() {
		plugin();
		System.out.println("Audio Turn On ...");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio Turn Off ...");		
	}
}
