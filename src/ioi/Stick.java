package ioi;

public class Stick extends Item {
	public Stick(){
		
	}

	public Stick(int aPoint, long price) {
		super(aPoint, price);
	}

	@Override
	public String toString() {
		return "Stick [aPoint=" + aPoint + ", price=" + price + "]";
	}

	@Override
	public void attack() {
		System.out.println("Stick Attack ...");
	}
	
	public void fire(){
		System.out.println("Stick fire Attack ...");
	}
}
