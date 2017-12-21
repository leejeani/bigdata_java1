package user;

import exception.DuplicatedIDException;
import exception.IDNotFoundException;
import frame.Dao;
import vo.User;

public class UserDao extends Dao {
	
	User userDB[] = new User[5];
	
	public UserDao(){
		userDB[0] = new User("id01", "pwd01", "이말숙");
		userDB[1] = new User("id02", "pwd02", "김말숙");
		userDB[2] = new User("id03", "pwd03", "정말숙");
		userDB[3] = new User("id04", "pwd04", "장말숙");
		userDB[4] = new User("id05", "pwd05", "홍말숙");
	}

	@Override
	public void insert(Object obj) throws DuplicatedIDException {
		User user = (User)obj;
		// 입력 한 User 정보가 있으면
		// ID 중복 Exception을 발생 시킨다.
		for(User u:userDB){
			if((u.getId()).equals(user.getId())){
				throw new DuplicatedIDException();
			}
		}
		connectDB();
		System.out.println(user.getId()+"를 입력 하였습니다.");
		closeDB();
	}

	@Override
	public void delete(Object obj) throws IDNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object obj) throws IDNotFoundException {
		// TODO Auto-generated method stub
		
	}

	

}
