package db1;

public class DB {
	private String ip;
	public DB() {
	}
	public DB(String ip) {
		this.ip = ip;
	}
	private void connect(){
		System.out.println(ip+" 에 Connect 하였습니다.");
	}
	private void close(){
		System.out.println(ip+" 에 Close 하였습니다.");
	}

	// CRUD Function 
	public void insert(Object data){
		connect();
		User user = (User)data;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println(id+" "+pwd+" "+name);
		System.out.println("Oracle 에 입력 완료");
		close();
	}
	public void update(Object data){
		connect();
		User user = (User)data;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println(id+" "+pwd+" "+name);
		System.out.println("수정 완료");
		close();
	}
	public void delete(Object data){
		connect();
		System.out.println(data+" 삭제 완료");
		close();
	}
	public void select(Object data){
		connect();
		System.out.println(data+" 조회 완료");
		close();
	}
	public void selectAll(){
		connect();
		System.out.println(" 전체조회 완료");
		close();
	}
}







