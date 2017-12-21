package shape;

public class Shape {
	protected String color;

	public Shape() {
	}

	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void draw(){
		System.out.println("Shape Draw ...");
	}
	public void move(int x, int y){
		
	}
}










