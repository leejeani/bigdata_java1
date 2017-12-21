package ioi;

public class Sward extends Item {
	public Sward(){
		
	}

	public Sward(int aPoint, long price) {
		super(aPoint, price);
	}

	@Override
	public String toString() {
		return "Sward [aPoint=" + aPoint + ", price=" + price + "]";
	}

	@Override
	public void attack() {
		System.out.println("Sward Attack ...");
	}
	
	public void swing(){
		System.out.println("Sward Swing Attack ...");
	}
	
}
