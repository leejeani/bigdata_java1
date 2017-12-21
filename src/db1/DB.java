package db1;

public class DB {
	private String ip;
	public DB() {
	}
	public DB(String ip) {
		this.ip = ip;
	}
	private void connect(){
		System.out.println(ip+" �� Connect �Ͽ����ϴ�.");
	}
	private void close(){
		System.out.println(ip+" �� Close �Ͽ����ϴ�.");
	}

	// CRUD Function 
	public void insert(Object data){
		connect();
		User user = (User)data;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println(id+" "+pwd+" "+name);
		System.out.println("Oracle �� �Է� �Ϸ�");
		close();
	}
	public void update(Object data){
		connect();
		User user = (User)data;
		String id = user.getId();
		String pwd = user.getPwd();
		String name = user.getName();
		System.out.println(id+" "+pwd+" "+name);
		System.out.println("���� �Ϸ�");
		close();
	}
	public void delete(Object data){
		connect();
		System.out.println(data+" ���� �Ϸ�");
		close();
	}
	public void select(Object data){
		connect();
		System.out.println(data+" ��ȸ �Ϸ�");
		close();
	}
	public void selectAll(){
		connect();
		System.out.println(" ��ü��ȸ �Ϸ�");
		close();
	}
}







