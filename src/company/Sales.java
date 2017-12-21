package company;

public class Sales extends Employee {

	private double bonus;
	private String location;
	
	public Sales() {
	}
	public Sales(double bonus, String location) {
		this.bonus = bonus;
		this.location = location;
	}
	public Sales(int id, String name, String dept, double salary, double bonus, String location) {
		super(id, name, dept, salary);
		this.bonus = bonus;
		this.location = location;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Sales [bonus=" + bonus + ", location=" + location + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getDept()=" + getDept() + ", getSalary()=" + getSalary() + "]";
	}
	@Override
	public double getAnnSalary() {
		return salary * 12 +bonus;
	}

	
	
	
	
}





