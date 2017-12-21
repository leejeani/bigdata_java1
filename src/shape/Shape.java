package shape;

// 추상 클래스
// abstract
// 객체를 생성 할수는 없다.
// 모든 하위 클래스들의 Frame
// 클래스의 모든 구조는 가질수 있지만
// 추상 함수가 존재 해야만 한다.
public abstract class Shape {
	protected int x;
	protected int y;
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	abstract public double getArea();
	abstract public double getCircume();
	
	
}







