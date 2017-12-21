package product;

public abstract class Product {
	int price;
	int bonusPoint;
	
	
	
	public int getPrice() {
		return price;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public Product() {
	}
	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	public void plugin(){
		System.out.println("Product Pluged..");
	}
	public abstract void turnOn(); 
	public abstract void turnOff(); 
	
}








