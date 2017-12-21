package car2;

public class User {
	private String id;
	private String name;
	private Car car [];
	
	public User() {
	}
	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public User(String id, String name, Car[] car) {
		this.id = id;
		this.name = name;
		this.car = car;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car[] getCar() {
		return car;
	}
	public void setCar(Car[] car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
}






