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
	 * Item을 사용하여 공격을 한다.
	 * 공격을 진행 하면 Character의
	 * Level이 aPoint 만큼 증가 한다.
	 * Item class의 Object는 attack을 할 수 없다.
	 */
	public void attack(){
		
	}
	
	
}



