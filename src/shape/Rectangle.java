package shape;

public class Rectangle extends Shape {
	Point [] p;

	public Rectangle() {
	}

	public Rectangle(Point[] p) {
		this.p = p;
	}

	public Rectangle(String color, Point[] p) {
		super(color);
		this.p = p;
	}

	public Point[] getP() {
		return p;
	}

	public void setP(Point[] p) {
		this.p = p;
	}

	@Override
	public void draw() {
		super.draw();
		for(Point point:p){
			System.out.println(point.getXY());
		}
	}

	@Override
	public void move(int x, int y) {
		for(Point point:p){
			point.setX(point.getX()+x);
			point.setY(point.getY()+y);
		}
	}

	
}









