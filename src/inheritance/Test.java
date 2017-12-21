package inheritance;

public class Test {

	public static void main(String[] args) {
		Parent p = new Parent("ȫ�浿",50,"����");
		Child c = new Child("ȫ���",10,"����");
		Child2 c2 = 
				new Child2("ȫ���",20,"����","Seoul");
		
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





