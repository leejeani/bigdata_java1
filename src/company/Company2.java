package company;

public class Company2 {

	public static void main(String[] args) {
		//Employee e1 = new Sales();
		//Employee e2 = new Secratary();
		
		//Heterogeneous Collection
		// inheritance
		Employee emps [] = new Employee[3];
		emps[0] = new Employee(100,"�̻��","����", 300);
		emps[1] = new Sales(100,"�̻��","����", 300,500,"����");
		emps[2] = new Secratary(100,"�̻��","����", 300,"�̺���");
		
		// Polymorphism ������
		// override ������

		for(Employee e:emps){
			System.out.println(e.toString());
			System.out.println(e.getAnnSalary());
			if(e instanceof Secratary){
				Secratary s = (Secratary)e;
				System.out.println(s.getBoss());
			}
		}
	}

}





