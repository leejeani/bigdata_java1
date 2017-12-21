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
	 * item�� aPoint��ŭ level�� ��� �ȴ�.
	 * �� Character�� 1�� ���� �Ѵ�.
	 */
	public void attack(){
		this.level++;
		System.out.println("Character Attack ..");
	}

	/**
	 * Character�� Item�� ���� �� �� �ִ�.
	 * ���� �� ������ �ݾ��� ���� �Ѵ�.
	 * ������ �ݾ� ���� ū Item�� ���� �� �� ����.
	 * ��, �Ϲ� Character�� ���� �� �� ����.
	 */
	public void buyItem(Item item){
		System.out.println("Item�� ���� �� �� �����ϴ�.");
	}
	
}




