package db;

public class MariaDB extends DB {

	public MariaDB(){
		
	}
	
	
	public MariaDB(String ip) {
		super(ip);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void insert(Object obj) {
		connect();
		User user = (User)obj;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println("MariaDB�� �Է� �մϴ�.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public void delete(Object obj) {
		connect();
		System.out.println(obj.toString()+" �� MariaDB���� ���� �մϴ�.");
		close();
	}

	@Override
	public void update(Object obj) {
		connect();
		User user = (User)obj;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println("MariaDB�� ���� ���� �˴ϴ�.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public Object select(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
