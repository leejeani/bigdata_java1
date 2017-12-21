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
		System.out.println("MariaDB에 입력 합니다.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public void delete(Object obj) {
		connect();
		System.out.println(obj.toString()+" 를 MariaDB에서 삭제 합니다.");
		close();
	}

	@Override
	public void update(Object obj) {
		connect();
		User user = (User)obj;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println("MariaDB에 수정 진행 됩니다.");
		System.out.println(id+" "+pwd+" "+name);
		close();
	}

	@Override
	public Object select(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
