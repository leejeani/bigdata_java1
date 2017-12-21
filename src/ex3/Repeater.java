package ex3;

public class Repeater {
	Account acc;
	public Repeater(){
		acc = new Account();
	}
	public void deposit(double money)
	throws Exception {
		try {
			acc.deposit(money);
		} catch (Exception e) {
			throw e;
		}
	}
}
