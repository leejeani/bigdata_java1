package db1;

public class Main {

	public static void main(String[] args) {
		User user = new User("id01", "pwd01", "ÀÌ¸»¼÷");
		DB db = new DB("203.234.247.100");
		db.insert(user);
		user.setPwd("pwd02");
		db.update(user);
		db.delete("id01");
		
	}

}








