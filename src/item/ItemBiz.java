package item;

import exception.DuplicatedIDException;
import exception.IDNotFoundException;
import frame.Biz;

public class ItemBiz extends Biz {

	ItemDao dao;
	
	public ItemBiz(){
		dao = new ItemDao();
	}
	
	@Override
	public void register(Object obj) throws DuplicatedIDException {
		startTR();
		try{
			dao.insert(obj);
		}catch(DuplicatedIDException e){
			throw e;
		}
		endTR();
	}

	@Override
	public void remove(Object obj) throws IDNotFoundException {
		startTR();
		try{
			dao.delete(obj);
		}catch(IDNotFoundException e){
			throw e;
		}
		endTR();
	}

	@Override
	public void modify(Object obj) throws IDNotFoundException {
		startTR();
		try{
			dao.update(obj);
		}catch(IDNotFoundException e){
			throw e;
		}
		endTR();
	}

}




