package single;

public class Main {

	public static void main(String[] args) {
		Connect c1 = Manager.getConnect();
		Connect c2 = Manager.getConnect();
		Connect c3 = Manager.getConnect();
		if(c1 == c2){
			System.out.println("OK");
		}
	}

}
