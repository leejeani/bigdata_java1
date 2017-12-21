package tv;

public class Main {

	public static void main(String[] args) {
		TV tv = new TV("on", 7);
		tv.powerOn();
		System.out.println(tv);
		
		STV stv = 
			new STV("on", 9, "on", new SettopBox());
		stv.powerOn();
		System.out.println(stv);
	}

}
