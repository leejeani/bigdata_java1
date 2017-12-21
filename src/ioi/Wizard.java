package ioi;

public class Wizard extends Character {
	private Item item;
	private String skill;
	public Wizard() {
	}
	
	
	
	public Wizard(String id, long money, String skill) {
		super(id, money);
		this.skill = skill;
	}



	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getSkill() {
		return skill;
	}
	public void Skill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Wizard [item=" + item + ", skill=" + skill + ", id=" + id + ", level=" + level + ", hp=" + hp
				+ ", money=" + money + "]";
	}
	
	
	@Override
	public void buyItem(Item item) {
		if(!(item instanceof Stick)){
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
	public void magic(){
		System.out.println(this.skill +" fire ...");
	}
}





