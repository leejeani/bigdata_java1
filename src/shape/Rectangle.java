package shape;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircume() {
		return (width + height) * 2;
	}

}
