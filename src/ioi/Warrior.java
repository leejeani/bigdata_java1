package ioi;

public class Warrior extends Character {
	private Item item;
	private int stm;
	public Warrior() {
	}
	
	
	
	public Warrior(String id, long money, int stm) {
		super(id, money);
		this.stm = stm;
	}



	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getStm() {
		return stm;
	}
	public void setStm(int stm) {
		this.stm = stm;
	}
	@Override
	public String toString() {
		return "Warrior [item=" + item + ", stm=" + stm + ", id=" + id + ", level=" + level + ", hp=" + hp + ", money="
				+ money + "]";
	}
	
	
	@Override
	public void buyItem(Item item) {
		if(!(item instanceof Sward)){
			System.out.println("구매 할 수 없습니다..");
			return;
		}
		
		if(money < item.getPrice()){
			System.out.println("돈 더벌어와라..");
			return;
		}
		this.money = this.money - item.getPrice();
		this.item = item;
	}

	@Override
	public void attack() {
		item.attack();
		this.setLevel(this.getLevel()+
				item.getaPoint());
	}
	
	
}



