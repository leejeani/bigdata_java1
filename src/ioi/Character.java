package ioi;

public class Character {
	// member variable
	protected String id;
	protected int level;
	protected int hp;
	protected long money;
	// constructor
	
	public Character() {
	}
	
	public Character(String id, long money) {
		this.id = id;
		this.money = money;
		this.hp = 100;
		this.level = 1;
	}

	// getter/setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}
	// toString
	@Override
	public String toString() {
		return "Character [id=" + id + ", level=" + level + ", hp=" + hp + ", money=" + money + "]";
	}

	// member function
	/**
	 * item에 aPoint만큼 level이 향상 된다.
	 * 단 Character는 1씩 증가 한다.
	 */
	public void attack(){
		this.level++;
		System.out.println("Character Attack ..");
	}

	/**
	 * Character는 Item을 구매 할 수 있다.
	 * 구매 시 보유한 금액이 감소 한다.
	 * 보유한 금액 보다 큰 Item은 구매 할 수 없다.
	 * 단, 일반 Character는 구매 할 수 없다.
	 */
	public void buyItem(Item item){
		System.out.println("Item을 구매 할 수 없습니다.");
	}
	
}




