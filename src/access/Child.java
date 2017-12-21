package access;

public class Child extends Parent {
	String school;

	public Child() {
	}

	public Child(int age, String name, String school) {
		super(age, name);
		this.school = school;
	}

	@Override
	public String toString() {
		return "Child [school=" + school + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
	}


	
	
}




