package shape;

// �߻� Ŭ����
// abstract
// ��ü�� ���� �Ҽ��� ����.
// ��� ���� Ŭ�������� Frame
// Ŭ������ ��� ������ ������ ������
// �߻� �Լ��� ���� �ؾ߸� �Ѵ�.
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







