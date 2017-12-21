package db;

public class OracleDB extends DB {

	public OracleDB(){}
	
	
	public OracleDB(String ip) {
		super(ip);
	}


	@Override
	public void insert(Object obj) {
		connect();
		User user = (User)obj;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println("Oracle DB�� �Է� �մϴ�.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public void delete(Object obj) {
		connect();
		System.out.println(obj.toString()+" �� Oracle DB���� ���� �մϴ�.");
		close();
	}

	@Override
	public void update(Object obj) {
		connect();
		User user = (User)obj;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println("Oracle DB�� ���� ���� �˴ϴ�.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public Object select(Object obj) {
		User user = null;
		System.out.println(obj+" ��ȸ �� ..");
		user = new User("id01", "pwd01", "�̸���");
		return user;
	}
	

}








