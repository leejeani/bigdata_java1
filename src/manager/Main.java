package manager;

public class Main {

	public static void main(String[] args) {
		Item item1 = ItemManager.getItem("sward");
		Item item2 = ItemManager.getItem("gun");
		item1.attack();
		item2.attack();
		item1.deffence();
		item2.deffence();
	}

}
