package inheritance;

public class Child extends Parent{
	
	public Child(){
	}

	public Child(String name, int age, String address) {
		super(name, age, address);
	}
	// �ٽ� ���� �Ѵ�.
	// override
	public void play(){
		System.out.println(getName() 
				+ "  Go to Club ...!!!");
	}
	
}




