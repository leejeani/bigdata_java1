package shape;

public class Circle extends Shape {
	private int r;
	private Point center;
	public Circle() {
	}
	public Circle(String color, int r, Point center) {
		super(color);
		this.r = r;
		this.center = center;
	}
	public void draw(){
		System.out.println(color+" "
	                      +center.getXY()+" "+r);
	}
	@Override
	public void move(int x, int y) {
		center.setX(center.getX()+x);
		center.setY(center.getY()+y);
	}
	
}





