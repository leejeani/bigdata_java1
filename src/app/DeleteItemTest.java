package app;

import exception.IDNotFoundException;
import item.ItemBiz;

public class DeleteItemTest {

	public static void main(String[] args) {
		ItemBiz biz = new ItemBiz();
		try {
			biz.remove(200);
		} catch (IDNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
