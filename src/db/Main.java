package db;

public class Main {

	public static void main(String[] args) {
		User user = new User("id01", "pwd01", "ÀÌ¸»¼÷");
		DB db = DBManager.getDB("maria");
		db.insert(user);
		db.delete("id01");
		User updateUser = 
			new User("id01", "pwd00", "ÀÌ¸»¼÷");
		db.update(updateUser);
	}

}




