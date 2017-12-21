package app;

import exception.DuplicatedIDException;
import user.UserBiz;
import vo.User;

public class InsertTest {

	public static void main(String[] args) {
		User user = new User("id01", "pwd99", "홍말자");
		UserBiz biz = new UserBiz();
		try {
			biz.register(user);
		} catch (DuplicatedIDException e) {
			System.out.println("ID가 중복 입니다.");
		}
	}

}






