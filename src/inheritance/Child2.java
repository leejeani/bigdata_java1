package inheritance;

public class Child2 extends Parent {
	
	String schoolName;
	
	public Child2(){}

	public Child2(String name, int age, String address) {
		super(name, age, address);
	}

	public Child2(String name, int age, String address, String schoolName) {
		super(name, age, address);
		this.schoolName = schoolName;
	}
	// Specialization
	public void goToSchool(){
		System.out.println(
				getName()+ " go to "+this.schoolName);
	}

	@Override
	public String toString() {
		return super.toString()
				+" School Name:"+schoolName;
	}
	
	
	
}





