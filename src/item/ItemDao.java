package item;

import exception.DuplicatedIDException;
import exception.IDNotFoundException;
import frame.Dao;
import vo.Item;

public class ItemDao extends Dao {

	Item itemDB [] = new Item[5];
	
	public ItemDao(){
		itemDB[0] = new Item(100, "item01", 1000);
		itemDB[1] = new Item(101, "item02", 2000);
		itemDB[2] = new Item(102, "item03", 3000);
		itemDB[3] = new Item(103, "item04", 4000);
		itemDB[4] = new Item(104, "item05", 5000);
	}
	
	@Override
	public void insert(Object obj) 
			throws DuplicatedIDException {
		Item item = (Item)obj;
		for(Item it:itemDB){
			if(it.getId() == item.getId()){
				throw new DuplicatedIDException();
			}
		}
		connectDB();
		System.out.println(item.getName()+"입력완료");
		closeDB();
	}

	@Override
	public void delete(Object obj) throws IDNotFoundException {
		int id = (int) obj;
		int cnt = 0;
		for(Item it:itemDB){
			if(it.getId() == id){
				cnt++;
			}
		}
		if(cnt <= 0){
			throw new IDNotFoundException();
		}
		connectDB();
		System.out.println(id+" 삭제 되었습니다.");
		closeDB();
		
	}

	@Override
	public void update(Object obj) throws IDNotFoundException {
		Item item = (Item) obj;
		int cnt = 0;
		for(Item it:itemDB){
			if(it.getId() == item.getId()){
				cnt++;
			}
		}
		if(cnt <= 0 ){
			throw new IDNotFoundException();
		}
		connectDB();
		System.out.println(item.getName()+"수정되었습니다. ");
		closeDB();
	}

}






