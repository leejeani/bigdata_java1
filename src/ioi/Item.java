package ioi;

public class Item {
	protected int aPoint;
	protected long price;
	public Item() {
	}
	public Item(int aPoint, long price) {
		this.aPoint = aPoint;
		this.price = price;
	}
	public int getaPoint() {
		return aPoint;
	}
	public void setaPoint(int aPoint) {
		this.aPoint = aPoint;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	/**
	 * Item�� ����Ͽ� ������ �Ѵ�.
	 * ������ ���� �ϸ� Character��
	 * Level�� aPoint ��ŭ ���� �Ѵ�.
	 * Item class�� Object�� attack�� �� �� ����.
	 */
	public void attack(){
		
	}
	
	
}



