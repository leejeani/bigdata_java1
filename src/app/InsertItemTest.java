package app;

import exception.DuplicatedIDException;
import item.ItemBiz;
import vo.Item;

public class InsertItemTest {

	public static void main(String[] args) {
		Item item = new Item(100, "����", 20000);
		ItemBiz biz = new ItemBiz();
		try {
			biz.register(item);
		} catch (DuplicatedIDException e) {
			System.out.println("�Է� �� ����");
		}
	}

}
