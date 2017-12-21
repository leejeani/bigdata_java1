package ex3;

public class Account {
	
	public void deposit(double money)
	throws Exception{
		if(money < 0){
			throw new Exception();
		}
	}
}
