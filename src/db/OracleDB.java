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
		System.out.println("Oracle DB에 입력 합니다.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public void delete(Object obj) {
		connect();
		System.out.println(obj.toString()+" 를 Oracle DB에서 삭제 합니다.");
		close();
	}

	@Override
	public void update(Object obj) {
		connect();
		User user = (User)obj;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println("Oracle DB에 수정 진행 됩니다.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public Object select(Object obj) {
		User user = null;
		System.out.println(obj+" 조회 중 ..");
		user = new User("id01", "pwd01", "이말숙");
		return user;
	}
	

}








