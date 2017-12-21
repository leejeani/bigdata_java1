package shape;

public class Triangle extends Shape {
	Point [] p;

	public Triangle() {
	}

	public Triangle(Point[] p) {
		this.p = p;
	}

	@Override
	public void draw() {
		super.draw();
		for(Point point:p){
			System.out.print(point.getXY()+" ");
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





