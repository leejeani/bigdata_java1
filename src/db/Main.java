package db;

public class Main {

	public static void main(String[] args) {
		User user = new User("id01", "pwd01", "�̸���");
		DB db = DBManager.getDB("maria");
		db.insert(user);
		db.delete("id01");
		User updateUser = 
			new User("id01", "pwd00", "�̸���");
		db.update(updateUser);
	}

}




