package oop;

public class Car {
	private int serial;
	private String name;
	private String color;
	private int price;
	
	public Car() {
		this.serial = 1000;
		this.name = "k1";
		this.color = "gray";
		this.price = 0;
	}
	public Car(int serial) {
		this.serial = serial;
	}
	public Car(int serial, String name, String color) {
		this.serial = serial;
		this.name = name;
		this.color = color;
	}
	public Car(int serial, String name, 
			String color, int price) {
		this.serial = serial;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public void go(){
		System.out.println(this.name+" GO ...!");
	}
	
	public void stop(){
		System.out.println(this.name+" STOP ...!");
	}
	
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSerial() {
		return serial;
	}
	@Override
	public String toString() {
		return "Car [serial=" + serial + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
}





