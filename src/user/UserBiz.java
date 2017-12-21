package user;

import exception.DuplicatedIDException;
import exception.IDNotFoundException;
import frame.Biz;

public class UserBiz extends Biz {

	UserDao dao;
	
	public UserBiz(){
		dao = new UserDao();
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
		// TODO Auto-generated method stub

	}

	@Override
	public void modify(Object obj) throws IDNotFoundException {
		// TODO Auto-generated method stub

	}

}
