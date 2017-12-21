package db;

public abstract class DB {
	private String ip;

	public DB() {
	}

	public DB(String ip) {
		this.ip = ip;
	}
	
	public void close(){
		System.out.println(ip+" Close ..");
	}

	public void connect(){
		System.out.println(ip+" Connect ..");
	}
	
	public abstract void insert(Object obj);
	public abstract void delete(Object obj);
	public abstract void update(Object obj);
	public abstract Object select(Object obj);
	
}















