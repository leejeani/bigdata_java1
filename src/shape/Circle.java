package shape;

public class Circle extends Shape {
	private int r;
		
	public Circle() {
	}

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + "]";
	}

	@Override
	public double getArea() {
		return r * r * Math.PI;
	}

	@Override
	public double getCircume() {
		return 2 * Math.PI * r;
	}




}
