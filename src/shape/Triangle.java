package shape;

public class Triangle extends Shape {
	private int width;
	private int height;
	
	public Triangle() {
	}

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public double getArea() {
		return width * height / 2.0;
	}

	@Override
	public double getCircume() {
		double c = 
		Math.sqrt(
			Math.pow(width, 2)+Math.pow(height, 2)
		);
		double result = 0.0;
		result = c + width + height;
		return result;
	}

}




