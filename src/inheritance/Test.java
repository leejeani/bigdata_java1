package inheritance;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent("È«±æµ¿",50,"¼­¿ï");
		Child c = new Child("È«±æ¶Ë",10,"¼­¿ï");
		Child2 c2 = 
				new Child2("È«±æ¼ø",20,"¼­¿ï","Seoul");
		
		System.out.println(p);
		System.out.println(c);
		System.out.println(c2);
		
		p.play();
		c.play();
		c2.play();

		System.out.println(p.getName());
		System.out.println(c.getName());
		System.out.println(c2.getName());
		
		c2.goToSchool();
		
		p.go();
		c.go();
		c2.go();
	}

}





