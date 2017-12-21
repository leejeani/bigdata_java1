package access;

public class Parent {
	private int age;
	private String name;
	public Parent() {
	}
	public Parent(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Parent [age=" + age + ", name=" + name + "]";
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
	
}






