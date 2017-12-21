package manager;

public class ItemManager {
	public static Item getItem(String str){
		Item item = null;
		switch(str){
		case "sward":
			item = new Sward();
			break;
		case "stick":
			item = new Stick();
			break;
		case "gun":
			item = new Gun();
			break;
		}
		return item;
	}
}
