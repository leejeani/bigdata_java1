package access2;

import access.Parent;

public class Child extends Parent {
	String school;

	@Override
	public String toString() {
		return "Child [school=" + school + ", getAge()=" + getAge() + ", getName()=" + getName() + "]";
	}

	
}
