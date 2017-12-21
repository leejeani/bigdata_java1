package user;

import exception.DuplicatedIDException;
import exception.IDNotFoundException;
import frame.Dao;
import vo.User;

public class UserDao extends Dao {
	
	User userDB[] = new User[5];
	
	public UserDao(){
		userDB[0] = new User("id01", "pwd01", "�̸���");
		userDB[1] = new User("id02", "pwd02", "�踻��");
		userDB[2] = new User("id03", "pwd03", "������");
		userDB[3] = new User("id04", "pwd04", "�帻��");
		userDB[4] = new User("id05", "pwd05", "ȫ����");
	}

	@Override
	public void insert(Object obj) throws DuplicatedIDException {
		User user = (User)obj;
		// �Է� �� User ������ ������
		// ID �ߺ� Exception�� �߻� ��Ų��.
		for(User u:userDB){
			if((u.getId()).equals(user.getId())){
				throw new DuplicatedIDException();
			}
		}
		connectDB();
		System.out.println(user.getId()+"�� �Է� �Ͽ����ϴ�.");
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
