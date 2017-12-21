package inter;

public class Main {

	public static void main(String[] args) {
		Shopping shop = ShopManager.getShopping("cj");
		shop.register();
		shop.login();
		shop.withdraw();
	}

}
