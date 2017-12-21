package company;

public class Secratary extends Employee {
	private String boss;

	public Secratary() {
	}

	public Secratary(int id, String name, String dept, double salary, String boss) {
		super(id, name, dept, salary);
		this.boss = boss;
	}

	public String getBoss() {
		return boss;
	}

	public void setBoss(String boss) {
		this.boss = boss;
	}

	@Override
	public String toString() {
		return "Secratary [boss=" + boss + ", getId()=" + getId() + ", getName()=" + getName() + ", getDept()="
				+ getDept() + ", getSalary()=" + getSalary() + "]";
	}

	
}







