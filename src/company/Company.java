package company;

public class Company {

	public static void main(String[] args) {
		Employee emp = 
				new Employee(100, "�̻��", "����",100);
		Sales sale = new Sales(101, "�̿���", "����", 120, 500, "����");
		Secratary sec = 
			new Secratary(102, "�̺�", "��", 130, "��ȸ��");
		
		System.out.println(emp);
		System.out.println(sale);
		System.out.println(sec);
	
		System.out.println(emp.getAnnSalary());
		System.out.println(sale.getAnnSalary());
		System.out.println(sec.getAnnSalary());
	
				
		System.out.println(emp.getTax());
		System.out.println(sale.getTax());
		System.out.println(sec.getTax());
		
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
