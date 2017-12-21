package inter;

public class ShopManager {
	public static Shopping getShopping(String str){
		Shopping shop = null;
		switch(str){
		case "gs":
			shop = new GSShop();
			break;
		case "cj":
			shop = new CJMall();
		    break;
		}
		return shop;
	}
}
