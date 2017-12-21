package inheritance;

public class Parent {
	private String name;
	private int age;
	private String address;
	
	public Parent() {
	}
	public Parent(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void play(){
		System.out.println(this.name+" Play ...!!");
	}
	@Override
	public String toString() {
		return "Family [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	public void go(){
		System.out.println(this.name+" Go !!");
	}
	
}





