package single;

public class Manager {
	private static Connect connect;
	private Manager(){}
	public static Connect getConnect(){
		if(connect == null){
			connect = new Connect();	
		}
		return connect;
	}
}
