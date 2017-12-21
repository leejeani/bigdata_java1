package inter;

public class GSShop implements Shopping {

	@Override
	public void login() {
		System.out.println("GSShop Login");
	}

	@Override
	public void register() {
		System.out.println("GSShop Register");
	}

	@Override
	public void withdraw() {
		System.out.println("GSShop Withdraw");
	}

}
